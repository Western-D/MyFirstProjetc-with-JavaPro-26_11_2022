package hometask12;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class PetrolStation extends MyRunnableObject {
    private double fuel = 50.0;
    private int reserveFuel = 0;
    private boolean isFuel = true;
    private static int gasStationColumn = 3;
    private Queue<Car> carQueue = new ConcurrentLinkedQueue<>();
    private int amountCar = 0;
    ThreadSafeList threadSafeList;

    public void open() {
        threadSafeList = new ThreadSafeList(gasStationColumn, this);
        for (int i = 0; i < threadSafeList.get().size(); i++) {
            threadSafeList.get().get(i).start();
        }

        while (isFuel) {
            if(carQueue.size() < 10)
            {
                carQueue.add(new Car(++amountCar));
            }
            ThreadSafeList.sleep(1);
        }
        ThreadSafeList.sleep(10);
    }

    @Override
    public void run(){
        while(isFuel){
            doRefuel();
        }
    }
    protected void doRefuel() {
        Car car = null;
        synchronized (carQueue) {
            int trying = 0;
            while (carQueue.isEmpty()){
                ++trying;
                ThreadSafeList.sleep(3);
                if (trying == 3)
                    currentThread().interrupt();
            }

            if (!carQueue.isEmpty()) {
                car = carQueue.poll();
            }
        }
        if (fuel - car.getNeedFUel()-reserveFuel >= 0 && isFuel) {
            synchronized (this) {
                reserveFuel += car.getNeedFUel();
            }

            getFillingLog(car);

            synchronized (this) {
                fuel -= car.getNeedFUel();
                reserveFuel -= car.getNeedFUel();
                System.out.println(car.getName() + " заправилась и уехала. Колонка № " + Thread.currentThread().getName() + " свободна");
                System.out.println("осталось литров: " + fuel);
            }

        }
        else if ((fuel - reserveFuel >= 0) && (fuel - reserveFuel - car.getNeedFUel() < 0) && isFuel){
            isNotFuel();
            getFillingLog(car);
            double leftFuel = fuel - reserveFuel;
            synchronized (this) {
                fuel -= leftFuel;
            }
            System.out.println(car.getName() + " заправила оставшиеся " + (leftFuel) + " и уехала. Колонка № " + Thread.currentThread().getName() + " свободна");
            Thread.currentThread().interrupt();
        }
        else
             isNotFuel();
    }
    private void getFillingLog (Car car) {
        System.out.println("Подъехала машина: " + car.getName() + " к колонке № " + Thread.currentThread().getName());
        System.out.println(car.getName() + " заправляется, необходимо " + car.getNeedFUel() + " литров");
        ThreadSafeList.sleep(car.getNeedFUel());
    }
    private void isNotFuel(){
        if (isFuel) {
            isFuel = false;
        }
        else
            Thread.currentThread().interrupt();
        }
    }


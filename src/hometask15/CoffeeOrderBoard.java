package hometask15;

import hometask12.MyRunnableObject;
import Threads.ThreadSafeList;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class CoffeeOrderBoard extends MyRunnableObject {
    private int numberOrder = 0;
    private static int threads = 4;
    Queue<Order> orderBoard = new ConcurrentLinkedQueue<>();
    List<Order> deliveryOrders = new ArrayList<>();
    private boolean isOpen;


    public void addOrder(Order order){
    orderBoard.add(order);

    }
    public void open(){
        isOpen = true;
        ThreadSafeList threadSafeList = new ThreadSafeList(threads,this);
        for (int i = 0; i < threadSafeList.get().size(); i++) {
            threadSafeList.get().get(i).start();
        }
        while (isOpen){
            synchronized (this) {
                addOrder(new Order(++numberOrder, "TestPersonName"+numberOrder));
            }
            ThreadSafeList.sleep(new Random().nextInt(1,2));
        }
    }

    @Override
    public void run() {
        if(currentThread().getName().equalsIgnoreCase("1")){
            while (isOpen)
                makingCoffee();
        }if(currentThread().getName().equalsIgnoreCase("2")){
            while (isOpen)
                orderGivenBoard();
        }
        if(currentThread().getName().equalsIgnoreCase("3")){
            while (isOpen)
                orderGiven();
        }
        if(currentThread().getName().equalsIgnoreCase("4")){
            ThreadSafeList.sleep(5);
            synchronized (this){

                if(!deliveryOrders.isEmpty())
                    deliver(new Random().nextInt(deliveryOrders.get(deliveryOrders.size()-1).getNumberOfOrder()+1, numberOrder));
            }
            ThreadSafeList.sleep(120);
            isOpen = false;
        }
    }

    private void makingCoffee(){
        ThreadSafeList.sleep(new Random().nextInt(4,5));
        deliver();
    }
    public void deliver (int numberOfOrder){
        synchronized (this) {

            for (Order order:
                    orderBoard) {
                if (order.getNumberOfOrder() == numberOfOrder) {
                    System.out.println("Заказ № " + order.getNumberOfOrder() + " готов и его забрали!");
                    orderBoard.remove(order);
                    break;
                }
            }
        }
    }

    public void deliver (){
        synchronized (this){
            if(!orderBoard.isEmpty())
            {
                deliveryOrders.add(orderBoard.poll());
            }
        }
    }
    private void orderGivenBoard(){
        System.out.println("Готовые заказы: ");
        System.out.println("Номер | Заказчик");
        synchronized (this){
            for (Order order :
                    deliveryOrders) {
                System.out.println(order.getNumberOfOrder()+" | " + order.getNameOfPerson());
            }
        }
        ThreadSafeList.sleep(4);
        System.out.println("\n\n\n\n\n\n");
    }
    private void orderGiven(){
        synchronized (this) {
            if (!deliveryOrders.isEmpty()) {
                int tempOrder = new Random().nextInt(0, deliveryOrders.size());
                deliveryOrders.remove(tempOrder);
            }
        }
        ThreadSafeList.sleep(new Random().nextInt(5,6));

    }
}

package hometask12;

import java.util.Random;

public class Car {
    private int needFUel = new Random().nextInt(3,10);
    private String name;

    public synchronized String getName() {
        return name;
    }

    public Car(int amount) {
        name = "Car # " + amount;
        System.out.println("Подъехала машина: " + name + " и стала в очередь");
    }

    public synchronized int getNeedFUel(){
        return needFUel;
    }
}


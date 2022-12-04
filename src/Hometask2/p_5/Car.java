package Hometask2.p_5;

public class Car {
    public void start(){
        startElectricity();
        startCommand();
        startFuelSystem();
    }
    private void startElectricity() {
        System.out.println("Электроника запущена");
    }
    private void startCommand() {
        System.out.println("Компьютер запущен");

    }
    private void startFuelSystem(){
        System.out.println("Топливная система запущена");

    }

}


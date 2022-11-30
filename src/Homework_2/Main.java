package Homework_2;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Loy", (byte) 4, (short) 6, true);
        cat.IsSleep();
        cat.doSleep();
        cat.IsSleep();
        cat.doDrink();
        cat.doEat();
        cat.doMove();
    }
}
package Homework_2;

public class Cat extends Animal{
    public Cat(String name, byte paws, short age, boolean sex) {
        super(name, paws, age, sex);
    }

    @Override
    public void doMove() {
        System.out.println(getName() + " is running!");
    }
}

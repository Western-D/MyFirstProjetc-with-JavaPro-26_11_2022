package Hometask3;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.doRun(500);
        dog.doSwim(20);

        cat.doRun(300);
        cat.doSwim(22);

        System.out.println(Cat.getCatCount());
        System.out.println(Dog.getDogCount());
        System.out.println(Animals.getAnimalCount());
    }
}

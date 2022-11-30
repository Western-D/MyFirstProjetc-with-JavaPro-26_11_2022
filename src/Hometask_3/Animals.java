package Hometask_3;

public abstract class Animals {
    public abstract void doRun(int distance);
    public abstract void doSwim(int distance);

    public static int getAnimalCount() {
        return animalCount;
    }

    private static int animalCount;
    Animals(){
        ++animalCount;
    }
}

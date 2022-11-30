package Hometask_3;

public abstract class Animals {
    public abstract void doRun(int distance);
    public abstract void doSwim(int distance);
    static int animalCount;
    Animals(){
        ++animalCount;
    }
}

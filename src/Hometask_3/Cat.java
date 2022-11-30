package Hometask_3;

public class Cat extends Animals {
    public String getName() {
        return name;
    }

    private String name;
    static int catCount = 0;

    Cat() {
        ++catCount;
        this.name = "Pushok_" + catCount;
    }

    @Override
    public void doRun(int distance) {
        if (distance < 0) {
            System.out.println("Input error");
        } else {
            if (distance > 200) {
                System.out.println("Maximum running distance is 200 meters. Your distance is: "+ distance);
            }
            else {System.out.println(name + " ran " + distance + " meters!");}
        }
    }

    @Override
    public void doSwim(int distance) {
        System.out.println("Cats can`t swim!");
    }
}

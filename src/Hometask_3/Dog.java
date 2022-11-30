package Hometask_3;

public class Dog extends Animals{
    public String getName() {
        return name;
    }

    private String name;
    static int dogCount = 0;
    Dog(){
        ++dogCount;
        this.name = "Bobik_" + dogCount;
    }
    @Override
    public void doRun(int distance) {
        if (distance < 0) {
            System.out.println("Input error");
        }else
        {
            if (distance > 500){
                System.out.println("Maximum running distance is 500 meters. Your distance is: "+ distance);
            }
            else {System.out.println(name + " ran " + distance + " meters!");}
        }
    }

    @Override
    public void doSwim(int distance) {
        if (distance < 0) {
            System.out.println("Input error");
        }else
        {
            if (distance > 10){
                System.out.println("Maximum swimming distance is 10 meters. Your distance is: "+ distance);
            }
            else {System.out.println(name + " swam " + distance + " meters!");}
        }
    }

}

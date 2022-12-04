package Hometask4.Steeplechase;

public class Treadmill extends Obstacle{
    public static int treadmillCount = 1;
    public Treadmill() {
        super(0,1500 * treadmillCount);
        ++treadmillCount;
    }



}

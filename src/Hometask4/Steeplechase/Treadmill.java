package Hometask4.Steeplechase;

public class Treadmill extends Obstacle{
    private static int treadmillCount = 1;
    public Treadmill() {
        super(0,1500 * treadmillCount);
        ++treadmillCount;
    }
    @Override
    public void overcome(Participant participant) {
        participant.run(this.getDistanceOfTrack());
    }
}

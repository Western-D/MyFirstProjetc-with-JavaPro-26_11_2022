package Hometask4.Steeplechase;

public abstract class Obstacle {
    private int heightOfWall;

    public int getHeightOfWall() {
        return heightOfWall;
    }

    public int getDistanceOfTrack() {
        return distanceOfTrack;
    }

    private int distanceOfTrack;

    public Obstacle(int heightOfWall, int distanceOfTrack) {
        this.heightOfWall = heightOfWall;
        this.distanceOfTrack = distanceOfTrack;
    }
    public abstract void overcome(Participant participant);
}

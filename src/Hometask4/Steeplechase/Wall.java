package Hometask4.Steeplechase;

public class Wall extends Obstacle{
    @Override
    public void overcome(Participant participant) {
        participant.jump(getHeightOfWall());
    }

    private static int wallCount = 1;
    public Wall() {
        super(15 * wallCount,0);
        ++wallCount;
    }
}

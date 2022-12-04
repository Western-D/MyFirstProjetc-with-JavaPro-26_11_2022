package Hometask4.Steeplechase;

public class Wall extends Obstacle{
    public static int wallCount = 1;
    public Wall() {

        super(15 * wallCount,0);
        ++wallCount;
    }
}

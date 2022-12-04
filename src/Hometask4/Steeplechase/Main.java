package Hometask4.Steeplechase;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Obstacle> obstacleList = new ArrayList<>();
        ArrayList<Participant> participantList = new ArrayList<>();

        Participant participant1 = new Cat();
        Participant participant2 = new Human();
        Participant participant3 = new Robot();

        participantList.add(participant1);
        participantList.add(participant2);
        participantList.add(participant3);

        obstacleList.add(new Treadmill());
        obstacleList.add(new Wall());
        obstacleList.add(new Treadmill());
        obstacleList.add(new Wall());
        obstacleList.add(new Treadmill());
        obstacleList.add(new Wall());

        run(participantList,obstacleList);

    }
    public static void run(ArrayList<Participant> participants, ArrayList<Obstacle> obstacles){
        for (Participant participant :
                participants) {
            for (Obstacle obstacle :
                    obstacles) {
                if (obstacle instanceof Treadmill){
                    participant.run(obstacle.distanceOfTrack);

                } else if (obstacle instanceof Wall) {
                    participant.jump(obstacle.heightOfWall);
                }
                if (participant.getCountObstacle() == 0)
                    break;
                if (participant.getCountObstacle() == obstacles.size())
                    System.out.println(participant.getName() + " пройшов всі випробування! \n");
            }
        }
    }
}

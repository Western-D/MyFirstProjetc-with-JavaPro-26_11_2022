package Hometask4.Steeplechase;

public abstract class Participant {
    private String name;
    private int maxJump; // in centimeters
    private int maxRunDistance; // in meters

    private int countObstacle;
    private int thisDistance;


    public Participant(String name, int maxJump, int maxRunDistance) {
        this.name = name;
        this.maxJump = maxJump;
        this.maxRunDistance = maxRunDistance;
    }
    public void run(int distance) {
        if (maxRunDistance >= distance){
            thisDistance += distance;
            System.out.println(String.format("Учасник %s пройшов перешкоду %s на дистанції %d метрів.",
                    name, "\"Бігова дорожка\"" , thisDistance));

            ++countObstacle;
        }
        else{
            System.out.println(String.format("Учасник %s не пройшов перешкоду %s на дистанції %d метрів. Пройдено: %d перешкод.\n",
                    name, "\"Бігова дорожка\"" , thisDistance, countObstacle));
            countObstacle = 0;
        }
    }

    public int getCountObstacle() {
        return countObstacle;
    }

    public String getName() {
        return name;
    }

    public void jump(int hight){
        if(maxJump >= hight) {
            System.out.println(String.format("Учасник %s пройшов перешкоду %s на дистанції %d метрів.",
                    name, "\"Стіна\"" , thisDistance));
            ++countObstacle;
        }
        else {
            System.out.println(String.format("Учасник %s не пройшов перешкоду %s на дистанції %d метрів. Пройдено: %d перешкод.",
                    name, "\"Стіна\"" , thisDistance, countObstacle));
            countObstacle = 0;
        }


    }

}

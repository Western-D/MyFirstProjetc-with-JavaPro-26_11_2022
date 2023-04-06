package homework19;

public class Sys {
    public static void sleep(int millis){
        try {
            Thread.sleep(millis);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}

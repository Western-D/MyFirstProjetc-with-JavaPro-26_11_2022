package Hometask2.p_2_and_3;

public class Main {
    public static void main(String[] args) {
        Employees ivan = new Employees("Sidorod", "Ivan", "Sergeevich", 42, "worker", "siv1980@gmail.cim", "+380665774289");
        ivan.setE_mail("siv1980@gmail.com");
        System.out.println(ivan.getE_mail());
    }
}
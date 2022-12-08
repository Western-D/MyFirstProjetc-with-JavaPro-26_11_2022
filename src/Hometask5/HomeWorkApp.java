package Hometask5;

import java.util.random.RandomGenerator;

public class HomeWorkApp {
    public static void main(String[] args) {

    }
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSum(){
        RandomGenerator randomGenerator = RandomGenerator.getDefault();
        int number1 = RandomGenerator.getDefault().nextInt()%10;
        int number2 = RandomGenerator.getDefault().nextInt()%10;
        if (number1+number2 >= 0)
            System.out.println("Сума позитивна");
        else
            System.out.println("Сума негативна");
    }
    public static void printColor(){
        int value = RandomGenerator.getDefault().nextInt()%150+50;
        if (value <= 0)
            System.out.println("Червоний");
        else if (value <= 100)
            System.out.println("Жовтий");
        else
            System.out.println("Зелений");
    }
    public static void compareNumbers(){
        int a = RandomGenerator.getDefault().nextInt()%51+50;
        int b = RandomGenerator.getDefault().nextInt()%51+50;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    public static boolean isSumFrom10to20(int number1, int number2){
        return (number1 + number2) >= 10 && (number1 + number2) <=20;
    }
    public static void isPositiveNumber(int number){
        if (isNegativeNumber(number))
            System.out.println("Число негативне");
        else
            System.out.println("Число позитивне");
    }
    public static boolean isNegativeNumber(int number){
        return number < 0;
    }
    public static void repeatingText(String text, int repetitionCount){
        for (int i = 0; i < repetitionCount; i++) {
            System.out.println(text);
        }
    }
    public static boolean isLeapYear(int year){
        if (year%4 == 0){
            if (year%400 == 0){
                return true;
            }
            if (year%100 == 0)
                return false;
            return true;
        }
        return false;
    }
}

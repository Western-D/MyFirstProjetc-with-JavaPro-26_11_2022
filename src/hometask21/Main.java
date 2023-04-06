package hometask21;


import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.IntPredicate;


public class Main {
    public static IntPredicate[] intPredicates = new IntPredicate[]{
            n -> n%2 == 0,
            n -> Integer.toString(n).equals(new StringBuilder(Integer.toString(n)).reverse().toString()),
            n -> {
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        return false;
                    }
                }
                return true;
            }
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        int numberOfCases;

        numberOfCases = Integer.parseInt(scanner.nextLine());

        List<String> outputData = new ArrayList<>();

        while (numberOfCases != 0) {
            String inputData = scanner.nextLine();
            String[] line = inputData.split(" ");
            outputData.add(Answer(Integer.parseInt(line[0]), Integer.parseInt(line[1])));
            numberOfCases--;
        }
        System.out.println(outputData);
    }

    public static String Answer(int caseNumber, int foundedData){
        caseNumber--;
        String result = "";
        switch (caseNumber){
            case 0:  result = intPredicates[caseNumber].test(foundedData) ? "ODD" : "EVEN"; break;
            case 1:  result = intPredicates[caseNumber].test(foundedData) ? "PALINDROME" : "NOT PALINDROME"; break;
            case 2:  result = intPredicates[caseNumber].test(foundedData) ? "PRIME" : "COMPOSITE";break;
        }
        return result;
    }
}

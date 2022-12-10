package Hometask6;

import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class MiniGame {
    static final String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
            "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
            "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
    private static boolean isWin = false;
    private static void win(String word, int tries){
        System.out.println("You are win!");
        System.out.println("Secret word is: " + word);
        System.out.println("Tries = " + tries);
        isWin = true;
    }
    private static void lose(String word){
        System.out.print("\n\n\n\n\n\n\n\n");
        System.out.println("Secret word is " + word);
        System.out.println("You are lose, try again!");
        System.out.print("\n\n");
        startGame();
    }
    private static String chooseSecretWord(){
        return words[RandomGenerator.getDefault().nextInt(words.length)];
    }
    public static void startGame() {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        String secretWord = chooseSecretWord();
        int tries = 0;
        char[] secretPrint = new char[15];
        for (int i = 0; i < 15; i++) {
            secretPrint[i] = '#';
        }
        while (!isWin) {
            System.out.println(secretPrint);
            String inputWord = scanner.nextLine();
            ++tries;
            if (inputWord.equalsIgnoreCase(secretWord))
                win(secretWord, tries);
            else {
                secretPrint[tries-1] = secretWord.charAt(tries-1);
                if(tries == secretWord.length())
                    lose(secretWord);
            }
        }
    }
}

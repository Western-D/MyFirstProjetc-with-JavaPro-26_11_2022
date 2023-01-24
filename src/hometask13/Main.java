package hometask13;


import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        WordFinder wordFinder = new WordFinder();

        WordFinder.countOccurance(wordFinder.wordList, WordFinder.words[new Random().nextInt(WordFinder.words.length)]);

        ArrayList<Integer> intList = WordFinder.toList(new int[]{8,4,59,8,6,1,55,8,4,7});
        System.out.println(intList);

        System.out.println(WordFinder.findUnique(intList));

        System.out.println(wordFinder.wordList);
        WordFinder.calcOccurance(wordFinder.wordList);
        System.out.println(WordFinder.findOccurance(wordFinder.wordList));
    }
}


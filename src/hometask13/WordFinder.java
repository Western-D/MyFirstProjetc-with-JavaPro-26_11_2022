package hometask13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class WordFinder {
    public static String[] words = {"apple", "banana", "orange", "kiwi", "cherry", "grapes"};

    ArrayList<String> wordList = createList(20);

    public static ArrayList createList(int size){
        ArrayList<String> list = new ArrayList();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(words[random.nextInt(6)]);
        }
        return list;
    }
    public static void countOccurance(ArrayList <String> wordList, String key){
        int count = 0;
        for (String word :
                wordList) {
            if (word.equals(key))
                count++;
        }
        System.out.println(String.format("Word \"%s\" using %d times", key, count));
    }

    public static ArrayList toList(int[] array){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i :
                array) {
            list.add(i);
        }
        return list;
    }

    public static ArrayList findUnique(ArrayList <Integer> numberList){
        ArrayList<Integer> uniqueNumberList = new ArrayList<>();
        for (int i :
                numberList) {
            if(numberList.indexOf(i) == numberList.lastIndexOf(i))
            {
                uniqueNumberList.add(i);
            }
        }
        return uniqueNumberList;
    }
    public static void calcOccurance(ArrayList <String> wordList){
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < wordList.size(); i++) {
            if(!map.containsKey(wordList.get(i))){
                map.put(wordList.get(i), 1);
                for (int j = i+1; j < wordList.size(); j++) {
                    if (wordList.get(i).equals(wordList.get(j))){
                        map.put(wordList.get(i), map.get(wordList.get(i))+1);
                    }
                }
            }
        }
        for (Map.Entry <String,Integer> pair :
                map.entrySet()) {
            System.out.println(String.format("%s: %d", pair.getKey(),pair.getValue()));
        }
    }

    @Override
    public String toString() {
        return "WordFinder{" +
                "wordList=" + wordList +
                '}';
    }

    public static ArrayList<String> findOccurance(ArrayList <String> wordList) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < wordList.size(); i++) {
            if (!map.containsKey(wordList.get(i))) {
                map.put(wordList.get(i), 1);
                for (int j = i + 1; j < wordList.size(); j++) {
                    if (wordList.get(i).equals(wordList.get(j))) {
                        map.put(wordList.get(i), map.get(wordList.get(i)) + 1);
                    }
                }
            }
        }
        ArrayList<String> stringsOccuranceUniqueWords = new ArrayList<>();
        for (Map.Entry<String, Integer> pair :
                map.entrySet()) {
            stringsOccuranceUniqueWords.add(String.format("\n{\"name: %s, occurance: %d\"}", pair.getKey(), pair.getValue()));
        }
        return stringsOccuranceUniqueWords;
    }
}

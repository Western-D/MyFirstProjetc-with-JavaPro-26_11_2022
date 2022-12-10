package Hometask6;

public class Main {
    public static void main(String[] args) {
        MiniGame.startGame();
    }

    public static int findSymbolOccurance(String str, char ch)
    {
        if (str.indexOf(ch) == -1)
            return -1;
        int countChar = 0;
        for (char letter :
                str.toCharArray()) {
            if (letter == ch)
                ++countChar;
        }
        return countChar;
    }

    public static int findWordPosition(String source, String target){
        return new StringBuilder(source).indexOf(target);
    }

    public static String stringReverse(String oldWord){
        return new StringBuilder(oldWord).reverse().toString();
    }

    public static boolean isPalindrome(String word){
        for (int i = 0; i < word.length()/2; i++) {
            if (word.toLowerCase().charAt(i) != word.toLowerCase().charAt(word.length()-1-i))
                return false;
        }
        return true;
    }
}

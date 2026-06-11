package Day_4;
import java.util.*;

public class ReverseWordsIII {

    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";

        System.out.println("Original: " + s);
        System.out.println("Result: " + reverseWords(s));
    }
}
package Week_2.Day_2;
import java.util.*;

public class PermutationInString {

    public static boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length())
            return false;

        int[] need = new int[26];
        int[] window = new int[26];

        for (char ch : s1.toCharArray()) {
            need[ch - 'a']++;
        }

        int k = s1.length();

        for (int i = 0; i < s2.length(); i++) {

            window[s2.charAt(i) - 'a']++;

            if (i >= k) {
                window[s2.charAt(i - k) - 'a']--;
            }

            if (Arrays.equals(need, window))
                return true;
        }

        return false;
    }

    public static void main(String[] args) {

        String s1 = "ab";
        String s2 = "eidbaooo";

        System.out.println(checkInclusion(s1, s2));
    }
}
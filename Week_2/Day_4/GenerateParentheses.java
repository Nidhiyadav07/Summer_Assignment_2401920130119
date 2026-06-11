package Day_4;

import java.util.*;

public class GenerateParentheses {

    public static void generate(
            int open,
            int close,
            int n,
            String current,
            List<String> result) {

        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }

        if (open < n) {
            generate(open + 1,
                     close,
                     n,
                     current + "(",
                     result);
        }

        if (close < open) {
            generate(open,
                     close + 1,
                     n,
                     current + ")",
                     result);
        }
    }

    public static List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<>();

        generate(0, 0, n, "", result);

        return result;
    }

    public static void main(String[] args) {

        int n = 3;

        List<String> ans = generateParenthesis(n);

        System.out.println("Valid Parentheses:");

        for (String str : ans) {
            System.out.println(str);
        }
    }
}
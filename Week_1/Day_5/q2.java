package Week_1.Day_5;

import java.util.Arrays;

public class q2 {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
       q2 obj = new q2();
        char[] s = {'h', 'e', 'l', 'l', 'o'};
 
        obj.reverseString(s);

        System.out.println(Arrays.toString(s));
    }
}

package Week_1.Day_5;
public class q1 {

    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        q1 obj = new q1();
        String s = "A man, a plan, a canal: Panama";

        System.out.println("Is Palindrome: " + obj.isPalindrome(s));
    }
}
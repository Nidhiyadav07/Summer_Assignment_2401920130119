package Week_1.Day_2;
import java.util.HashSet;

public class q2 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 1, 2, 2};

        q2 obj = new q2();
        System.out.println(obj.containsDuplicate(nums));
    }
}
package Week_1.Day_2;

public class q1 {

    public static double findMaxAverage(int[] nums, int k) {
        int sum = 0;

        // First window
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;

        // Sliding window
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }

        return (double) maxSum / k;
    }

    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;

        double result = findMaxAverage(nums, k);
        System.out.println("Maximum Average = " + result);
    }
}
    


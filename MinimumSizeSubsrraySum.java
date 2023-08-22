public class MinimumSizeSubsrraySum {
    public static void main(String[] args) {
        int target = 7;
        int[] nums = { 2, 3, 1, 2, 4, 3 };

        input(target, nums);
    }

    public static void input(int target, int[] nums) {
        int windowSum = 0, windowStart = 0;
        int minWindowSize = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            windowSum += nums[i];

            while (windowSum >= target) {
                minWindowSize = Math.min(minWindowSize, i - windowStart + 1);
                windowSum -= nums[windowStart];
                windowStart++;
            }
        }
        // return minWindowSize==Integer.MAX_VALUE? 0: minWindowSize;
        if (minWindowSize == Integer.MAX_VALUE) {
            System.out.println("No subarray found.");
        } else {
            System.out.println("Minimum window size: " + minWindowSize);
        }
    }
}

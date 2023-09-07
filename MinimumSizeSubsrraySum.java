public class MinimumSizeSubsrraySum {
    public static void main(String[] args) {
        int target = 7;
        int[] nums = { 2, 3, 1, 2, 4, 3 };

        input(target, nums);
    }

    public static void input(int target, int[] nums) {
        int sum = 0, start = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= target) {
                min = Math.min(min, i - start + 1);
                sum -= nums[start];
                start++;
            }
        }
        if (min == Integer.MAX_VALUE) {
            return;
        } else {
            // return min;
            System.out.println(min);
        }
    }
}

public class SubarryProductLessThan {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 2, 6 };
        int k = 100;
        input(arr, k);
    }

    public static void input(int[] nums, int k) {
        // int n = nums.length;
        int p = 1;
        int ans = 0;
        for (int i = 0, j = 0; j < nums.length; j++) {
            p = p * nums[j];
            while (p >= k && i < j) {
                p /= nums[i];
                i++;
            }

            if (p < k) {
                ans += (j - i + 1);
            }
        }
        // return ans;
        System.out.println(ans);
    }
}

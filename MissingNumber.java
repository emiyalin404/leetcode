public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = { 3, 0, 1 };
        input(nums);

    }

    public static void input(int[] nums) {
        int n = nums.length, i = 0;
        while (i < n) {
            int j = nums[i];
            if (j < i && nums[i] != nums[j]) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            } else {
                i++;
            }
        }
        for (i = 0; i < n; i++) {
            if (nums[i] != i) {
                // return i;
                System.out.println(i);
            }
        }
        // return n;
    }
}

public class TwoSum {
    public static void main(String[] args) {
        int target = 13;
        int[] nums = { 2, 7, 11, 15 };
        input(nums, target);
    }

    public static void input(int[] nums, int target) {
        int i = 0, j = i + 1;
        while (i < j) {
            if (nums[i] + nums[j] == target) {
                System.out.println(i + " ," + j);
                break;
            }

            else if (j == nums.length - 1) {
                i++;
                j = i + 1;
            } else
                j++;

        }
        System.out.println(new int[] {});
    }
}

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int target = 9;
        int[] nums = { 2, 7, 11, 15 };
        input(nums, target);
    }

    public static void input(int[] nums, int target) {
        int[] arr = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                arr[0] = map.get(nums[i]);
                arr[1] = i;
                break;
            } else {
                map.put(target - nums[i], i);
            }
        }
        // return arr;
        System.out.println(arr);

        // int i = 0, j = i + 1;
        // while (i < j) {
        // if (nums[i] + nums[j] == target) {
        // System.out.println(i + " ," + j);
        // break;
        // }

        // else if (j == nums.length - 1) {
        // i++;
        // j = i + 1;
        // } else
        // j++;

        // }
        // System.out.println(new int[] {});
    }
}

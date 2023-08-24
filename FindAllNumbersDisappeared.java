// import java.util.ArrayList;
// import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappeared {
    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        List<Integer> missing = input(nums);
        System.out.println(missing);
        // input(nums);
    }

    public static List<Integer> input(int[] nums) {
        List<Integer> missed = new ArrayList<>();
        int i = 0, n = nums.length;

        while (i < n) {
            int j = nums[i] - 1;
            if (j < n && nums[i] != nums[j]) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            } else {
                i++;
            }
        }

        for (i = 0; i < n; ++i) {
            if (nums[i] != i + 1) {
                missed.add(i + 1);
            }
        }

        return missed;
    }
}

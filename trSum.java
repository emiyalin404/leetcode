
// import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class trSum {
    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        trSum solution = new trSum();
        List<List<Integer>> triplets = solution.threeSum(nums);
        System.out.println(triplets);
    }

    public List<List<Integer>> threeSum(int[] nums) {
        // List<List<Integer>> result=new ArrayList<>();
        // int n=nums.length;
        // Arrays.sort(nums);
        // for(int i=0;i<n;i++){
        // if(i>0 && nums[i]==nums[i-1]){
        // continue;
        // }

        // }
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int target = -nums[i];
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = nums[left] + nums[right];
                if (sum == target) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } else if (sum < target) {
                    left++;

                } else {
                    right--;
                }
            }
        }
        // System.out.println(result);
        return result;

    }
    // }

    // public List<List<Integer>> threeSum(int[] nums) {
    // List<List<Integer>> result = new ArrayList<>();
    // int n = nums.length;
    // Arrays.sort(nums); // 排序
    // for (int i = 0; i < n - 2; i++) {
    // if (i > 0 && nums[i] == nums[i - 1]) {
    // continue; // 跳过重复元素
    // }
    // int target = -nums[i];
    // int left = i + 1;
    // int right = n - 1;
    // while (left < right) {
    // int sum = nums[left] + nums[right];
    // if (sum == target) {
    // result.add(Arrays.asList(nums[i], nums[left], nums[right]));
    // left++;
    // right--;

    // while (left < right && nums[left] == nums[left - 1]) {
    // left++; // 跳过重复元素
    // }
    // while (left < right && nums[right] == nums[right + 1]) {
    // right--; // 跳过重复元素
    // }
    // } else if (sum < target) {
    // left++;
    // } else {
    // right--;
    // }
    // }
    // }

    // return result;
    // }

}

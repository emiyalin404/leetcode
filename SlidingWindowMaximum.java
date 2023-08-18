
import java.util.ArrayList;

import java.util.List;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;

        maxSlidingWindow(nums, k);
    }

    public static void maxSlidingWindow(int[] nums, int k) {

        // if (nums == null || nums.length == 0 || k <= 0) {
        // // return new int[0];
        // }

        // int[] result = new int[nums.length - k + 1];
        // int index = 0;

        // for (int i = 0; i <= nums.length - k; i++) {
        // int max = nums[i];
        // for (int j = i + 1; j < i + k; j++) {
        // max = Math.max(max, nums[j]);
        // }
        // result[index++] = max;
        // }

        // return result;
        // ----------------------------------------------
        List<Integer> numsList = new ArrayList<>();
        for (int num : nums) {
            numsList.add(num);
        }
        for (int i = 0; i <= numsList.size() - k; i++) {
            int max = numsList.get(i);
            for (int j = i + 1; j < i + k; j++) {
                max = Math.max(max, numsList.get(j));
            }
            System.out.print(max + " ");
        }
        // ----------------------------------------------
        // int max =0;
        // int arr[]=new int[nums.length-k+1];
        // int r=0;
        // for(int i=0;i<=nums.length;i++){
        // max=nums[i];
        // for(int j=1;j<k;j++){
        // if(nums[i+j]>max){
        // max=nums[i+j];
        // }
        // }
        // arr[r++]=max;
        // }
        // return arr;
    }
}

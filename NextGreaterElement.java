
// import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] nums = { 1, 2 };
        int[] nums2 = { 6, 2, 1, 5, 4 };
        input(nums, nums2);
    }

    public static void input(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums2.length; i++) {
            while (!stack.isEmpty() && nums2[i] > stack.peek()) {
                map.put(stack.pop(), nums2[i]);
            }
            stack.push(nums2[i]);
        }

        while (!stack.empty()) {
            map.put(stack.pop(), -1);
        }

        int[] arr = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            arr[i] = map.get(nums1[i]);
            System.out.print(arr[i] + ",");
        }
        // System.out.println(arr);
        // return arr;
    }
}

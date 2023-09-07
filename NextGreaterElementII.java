import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementII {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 1 };
        input(nums);
    }

    public static void input(int[] nums) {
        Stack<Integer> valueStack = new Stack<>();
        Stack<Integer> indexStack = new Stack<>();
        int[] ans = new int[nums.length];
        Arrays.fill(ans, -1);

        for (int i = 0; i < 2 * nums.length; i++) {
            int idx = i % nums.length;
            while (!valueStack.empty() && nums[idx] > valueStack.peek()) {
                int prevIndex = indexStack.pop();
                if (ans[prevIndex] == -1) {
                    ans[prevIndex] = nums[idx];
                }
                valueStack.pop();
            }

            if (ans[idx] == -1) {
                valueStack.push(nums[idx]);
                indexStack.push(idx);
            }
        }
        // return ans;
        System.out.println(ans);

    }
}

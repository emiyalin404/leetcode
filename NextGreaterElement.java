import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] nums = { 4, 1, 2 };
        int[] nums2 = { 1, 3, 4, 2 };
        input(nums, nums2);
    }

    public static void input(int[] nums1, int[] nums2) {
        // Use a hash table to store the <value, idx>
        Map<Integer, Integer> table = new HashMap<>();
        for (int i = 0; i < nums1.length; ++i) {
            table.put(nums1[i], i);
        }

        // Use a stack to get next greater element efficiently
        int[] ans = new int[nums1.length];
        Arrays.fill(ans, -1);
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < nums1.length; ++i) {
            while (!st.isEmpty() && st.peek() < nums2[i]) {
                int cur = st.pop();

                // 如果当前元素 cur 存在于哈希表中，这意味着 cur 在 nums1 数组中出现过
                // 所以我们应该将 nums2[i] 更新为作为 cur 的下一个更大元素
                if (table.containsKey(cur)) {
                    ans[table.get(cur)] = nums2[i];
                }
            }
            st.push(nums2[i]);
        }

        // return ans;

        for (var each : ans) {
            System.out.print(each + ",");
        }
    }
}

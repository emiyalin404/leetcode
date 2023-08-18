
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class SlidingWindowMaximumTwo {
    public static void main(String[] args) {
        int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;
        maxSlidingWindow(nums, k);
    }

    public static void maxSlidingWindow(int[] nums, int k) {
        List<Integer> numsList = new ArrayList<>();
        for (int num : nums) {
            numsList.add(num);
        }
        if (numsList == null || numsList.size() == 0 || k <= 0) {
            System.out.println(0);
        }
        // int n = numsList.size();
        // int[] result = new int[n - k + 1];
        // int resultIndex = 0;
        // Deque<Integer> deque = new ArrayDeque<>();
        // for (int i = 0; i < n; i++) {
        // while (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
        // deque.pollFirst();
        // }
        // while (!deque.isEmpty() && numsList.get(deque.peekLast()) < numsList.get(i))
        // {
        // deque.pollLast();
        // }
        // deque.addLast(i);
        // if (i >= k - 1) {
        // result[resultIndex++] = numsList.get(deque.peekFirst());
        // }
        // System.out.println(result);
        // }
        int n = numsList.size();
        int[] result = new int[n - k + 1];
        int resultIndex = 0;
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            while (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }
            while (!deque.isEmpty() && numsList.get(deque.peekLast()) < numsList.get(i)) {
                deque.pollLast();
            }
            deque.addLast(i);

            if (i >= k - 1) {
                result[resultIndex++] = numsList.get(deque.peekFirst());
            }
            for (int index = 0; index < resultIndex; index++) {
                System.out.print(result[index] + " ");
            }
            System.out.println();
        }
        // -------------------------------------------------------------------------
        // if (nums == null || nums.length == 0 || k <= 0) {
        // // return new int[0];
        // }
        // int n = nums.length;
        // int[] result = new int[n - k + 1];
        // int resultIndex = 0;
        // Deque<Integer> deque = new ArrayDeque<>();

        // for (int i = 0; i < n; i++) {
        // while (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
        // deque.pollFirst();
        // }

        // while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
        // deque.pollLast();
        // }
        // deque.pollLast();

        // if (i >= k - 1) {
        // result[resultIndex++] = nums[deque.peekFirst()];
        // }
        // }
        // // return result;
    }
}

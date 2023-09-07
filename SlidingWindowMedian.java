import java.util.Comparator;
import java.util.PriorityQueue;

public class SlidingWindowMedian {
    public static void main(String[] args) {
        int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;
        input(nums, k);
    }

    public static void input(int[] nums, int k) {
        int n = nums.length;
        double[] result = new double[n - k + 1];

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < k; i++) {
            maxHeap.offer(nums[i]);
        }
        for (int i = 0; i < k / 2; i++) {
            minHeap.offer(maxHeap.poll());
        }

        int resultIdx = 0;
        for (int i = k; i < n; i++) {
            if (k % 2 == 0) {
                result[resultIdx] = ((double) maxHeap.peek() + minHeap.peek()) / 2.0;
            } else {
                result[resultIdx] = (double) maxHeap.peek();
            }
            resultIdx++;

            int toRemove = nums[i - k];
            if (toRemove <= maxHeap.peek()) {
                maxHeap.remove(toRemove);
            } else {
                minHeap.remove(toRemove);
            }

            if (!maxHeap.isEmpty() && nums[i] <= maxHeap.peek()) {
                maxHeap.offer(nums[i]);
            } else {
                minHeap.offer(nums[i]);
            }

            while (maxHeap.size() > minHeap.size()) {
                minHeap.offer(maxHeap.poll());
            }
            while (minHeap.size() > maxHeap.size()) {
                maxHeap.offer(minHeap.poll());
            }
        }
        if (k % 2 == 0) {
            result[resultIdx] = ((double) maxHeap.peek() + minHeap.peek()) / 2.0;
        } else {
            result[resultIdx] = (double) maxHeap.peek();
        }
        System.out.println(result);
        // return result;
    }
}

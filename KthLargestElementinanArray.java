import java.util.PriorityQueue;

public class KthLargestElementinanArray {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 1, 5, 6, 4 };
        int k = 2;
        input(nums, k);
    }

    public static void input(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> b - a);
        for (int each : nums) {
            heap.add(each);
        }
        while (k > 1) {
            heap.poll();
            k--;
        }
        System.out.println(heap.poll());
        // System.out.println(heap);
    }
    // public static void input(int[] nums, int k) {
    // PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    // for (int num : nums) {
    // minHeap.offer(num);

    // if (minHeap.size() > k) {
    // minHeap.poll();
    // }
    // }
    // System.out.println(minHeap.peek());
    // // return minHeap.peek();
    // }
}

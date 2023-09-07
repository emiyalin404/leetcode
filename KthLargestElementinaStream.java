import java.util.PriorityQueue;

public class KthLargestElementinaStream {
    private PriorityQueue<Integer> minHeap;
    private int k;

    public KthLargestElementinaStream(int k, int[] nums) {
        this.k = k;
        minHeap = new PriorityQueue<>();
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        minHeap.offer(val);
        if (minHeap.size() > k) {
            minHeap.poll();
        }
        return minHeap.peek();
    }

    public static void main(String[] args) {
        int[] nums = { 4, 5, 8, 2 };
        KthLargestElementinaStream kthLargest = new KthLargestElementinaStream(3, nums);
        System.out.println(kthLargest.add(3)); // 输出 4
        System.out.println(kthLargest.add(5)); // 输出 5
        System.out.println(kthLargest.add(10)); // 输出 5
        System.out.println(kthLargest.add(9)); // 输出 8
        System.out.println(kthLargest.add(4)); // 输出 8
    }
}

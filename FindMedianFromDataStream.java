
// import java.util.List;
import java.util.PriorityQueue;

public class FindMedianFromDataStream {
    private PriorityQueue<Integer> maxHeap; // 存儲較小一半的數據
    private PriorityQueue<Integer> minHeap; // 存儲較大一半的數據

    public FindMedianFromDataStream() {
        maxHeap = new PriorityQueue<>((a, b) -> b - a); // 最大堆，使用Comparator反轉排序
        minHeap = new PriorityQueue<>(); // 最小堆
    }

    public void addNum(int num) {
        if (maxHeap.isEmpty() || num <= maxHeap.peek()) {
            maxHeap.offer(num);
        } else {
            minHeap.offer(num);
        }

        // 平衡兩個堆，使得堆的大小之差不超過1
        if (maxHeap.size() > minHeap.size() + 1) {
            minHeap.offer(maxHeap.poll());
        } else if (minHeap.size() > maxHeap.size()) {
            maxHeap.offer(minHeap.poll());
        }
    }

    public double findMedian() {
        if (maxHeap.size() == minHeap.size()) {
            return (double) (maxHeap.peek() + minHeap.peek()) / 2.0;
        } else {
            return (double) maxHeap.peek();
        }
    }

}

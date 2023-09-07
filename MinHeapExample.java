import java.util.PriorityQueue;

public class MinHeapExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(3);
        minHeap.add(1);
        minHeap.add(4);
        minHeap.add(2);

        int minElement = minHeap.peek();
        System.out.println("最小元素:" + minElement);

        minHeap.poll();

        minElement = minHeap.peek();
        System.out.println("移除最小元素後的最小元素" + minElement);
    }
}

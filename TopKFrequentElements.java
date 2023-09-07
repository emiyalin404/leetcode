import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    public static void main(String[] args) {
        TopKFrequentElements topKFrequent = new TopKFrequentElements();

        int[] nums = { 1, 1, 1, 2, 2, 3 };
        int k = 2;
        int[] ans = topKFrequent.input(nums, k);
        System.out.print(ans);
    }

    public int[] input(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int[] ans = new int[k];
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {

            public int compare(Integer a, Integer b) {
                return map.get(b) - map.get(a);
            }
        });
        for (int i : map.keySet()) {
            queue.add(i);
        }
        for (int i = 0; i < k; i++) {
            ans[i] = queue.poll();
        }
        return ans;
    }
}

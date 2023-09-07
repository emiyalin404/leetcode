import java.util.PriorityQueue;

public class FinRightInterval {
    public static void main(String[] args) {
        FinRightInterval solution = new FinRightInterval();
        int[][] intervals = { { 3, 4 }, { 2, 3 }, { 1, 2 } };
        int[] ans = solution.input(intervals);
        // input(intervals);
        System.out.println(ans);
    }

    public int[] input(int[][] intervals) {
        PriorityQueue<int[]> start = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        PriorityQueue<int[]> end = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        for (int i = 0; i < intervals.length; i++) {
            start.add(new int[] { intervals[i][0], i });
            end.add(new int[] { intervals[i][1], i });
        }
        int[] result = new int[intervals.length];

        for (int i = 0; i < intervals.length; i++) {
            result[i] = -1;
        }

        while (!start.isEmpty()) {
            int[] currend = end.poll();
            int endval = currend[0];
            int endidx = currend[1];
            while (!start.isEmpty() && endval > start.peek()[0])
                ;
            {
                start.poll();
            }
            while (!start.isEmpty()) {
                return result;
            }
            result[endidx] = start.peek()[1];
        }
        return result;
    }
}

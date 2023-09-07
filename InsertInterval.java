import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
    public static void main(String[] args) {
        InsertInterval solution = new InsertInterval();
        int[][] intervals = { { 1, 3 }, { 6, 9 } };
        int[] newInterval = { 2, 5 };
        int[][] result = solution.insert(intervals, newInterval);
        for (int[] interval : result) {
            System.out.print("[" + interval[0] + ", " + interval[1] + "]");
        }
    }

    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        int i = 0;
        int n = intervals.length;
        System.out.println("newInterval[0]: " + newInterval[0]);
        System.out.println("intervals[i][1]: " + intervals[i][1]);
        while (i < n && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }
        System.out.println("newInterval[1]: " + newInterval[1]);
        System.out.println("intervals[i][0]: " + intervals[i][0]);
        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        result.add(newInterval);

        while (i < n) {
            result.add(intervals[i]);
            i++;
        }
        return result.toArray(new int[result.size()][]);
    }
}

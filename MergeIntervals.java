import java.util.Arrays;

public class MergeIntervals {
    public static void main(String[] args) {
        MergeIntervals solution = new MergeIntervals();
        int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        // interval(intervals);
        int[][] ss = solution.interval(intervals);
        System.out.println(ss);
    }

    public int[][] interval(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int n = intervals.length;
        for (int i = 1; i < n; i++) {
            if (intervals[i][0] <= intervals[i - 1][1]) {
                intervals[i][1] = Math.max(intervals[i - 1][1], intervals[i][1]);
                intervals[i][0] = intervals[i - 1][0];
                intervals[i - 1][0] = -1;
                intervals[i - 1][1] = -1;
                n--;
            }
        }
        int[][] ans = new int[n][2];

        int i = 0;

        for (int[] a : intervals) {
            if (a[0] != -1) {
                ans[i][0] = a[0];
                ans[i][1] = a[1];
                i++;
            }
        }
        return ans;
    }
}

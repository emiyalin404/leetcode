import java.util.PriorityQueue;

public class KClosestPointstoOrigin {
    public static void main(String[] args) {
        KClosestPointstoOrigin solution = new KClosestPointstoOrigin();
        int[][] points = { { 1, 3 }, { -2, 2 } };
        int k = 1;
        int[][] ans = solution.input(points, k);
        System.out.println(ans);
    }

    public int[][] input(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        for (int i = 0; i < points.length; i++) {
            int sum = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            pq.add(new int[] { i, sum });
        }
        int[][] res = new int[k][];
        while (k > 0) {
            res[k - 1] = points[pq.poll()[0]];
            k--;
        }
        return res;
    }
}

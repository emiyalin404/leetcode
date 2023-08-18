public class MaximalNetworkRankTwo {
    public static void main(String[] args) {
        int[][] roads = { { 0, 1 }, { 0, 3 }, { 1, 2 }, { 1, 3 } };
        int n = 4;
        input(roads, n);
    }

    public static void input(int[][] roads, int n) {
        int mnr = 0;
        int[][] adjMat = new int[n][n];
        int[] hood = new int[n];

        for (int i = 0; i < roads.length; i++) {
            int[] edge = roads[i];
            int src = edge[0];
            int dst = edge[1];
            adjMat[src][dst] = 1;
            adjMat[dst][src] = 1;

            hood[src]++;
            hood[dst]++;
            System.out.println(hood);
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.println(adjMat[i][j]);
                int cur_mnr = hood[i] + hood[j] - adjMat[i][j];
                mnr = Math.max(mnr, cur_mnr);
            }
        }
        System.out.println(mnr);
    }
}

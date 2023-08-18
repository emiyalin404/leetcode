import java.util.LinkedList;

public class MatrixTwo {
    public static void main(String[] args) {
        int[][] mat = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
        input(mat);
    }

    public static void input(int[][] mat) {

        LinkedList<int[]> list1 = new LinkedList<>();
        int n = mat.length;
        int m = mat[0].length;
        int dist[][] = new int[n][m];
        boolean visited[][] = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    list1.add(new int[] { i, j });
                    dist[i][j] = 0;
                    visited[i][j] = true;
                }
            }
        }
        int dr[] = new int[] { 1, 0, -1, 0 };
        int dc[] = new int[] { 0, 1, 0, -1 };
        while (list1.size() > 0) {
            int arr[] = list1.poll();
            int x = arr[0];
            int y = arr[1];
            for (int i = 0; i < 4; i++) {
                int nx = x + dr[i];
                int ny = y + dc[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && visited[nx][ny] == false) {
                    visited[nx][ny] = true;
                    dist[nx][ny] = 1 + dist[x][y];
                    list1.add(new int[] { nx, ny });
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(dist[i][j] + " ");
            }
            System.out.println();
        }
        // return dist;
    }
}

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class MinimumNumberofFlipstoConvertBinaryMatrixtoZeroMatrix {
    public static void main(String[] args) {
        MinimumNumberofFlipstoConvertBinaryMatrixtoZeroMatrix MinimumNumber = new MinimumNumberofFlipstoConvertBinaryMatrixtoZeroMatrix();
        int[][] mat = { { 1, 1, 1 }, { 1, 0, 1 } };
        // minFlips(mat);
        MinimumNumber.minFlips(mat);
    }

    public int minFlips(int[][] mat) {
        int m = mat.length;
        int n = m > 0 ? mat[0].length : 0;
        if (m < 1 || n < 1) {
            return -1;
        }

        // Prepare for BFS
        HashSet<String> visited = new HashSet<>();
        Queue<int[][]> q = new LinkedList<>();
        q.offer(mat);
        visited.add(arrayToString(mat));

        int steps = 0;
        while (!q.isEmpty()) {
            int sz = q.size();
            for (int i = 0; i < sz; i++) {
                int[][] cur = q.poll();

                // Already turned all cells into 0
                if (allZero(cur)) {
                    // return steps;
                    System.out.println(steps);
                }

                for (int r = 0; r < m; r++) {
                    for (int c = 0; c < n; c++) {
                        // Flip the matrix centered at (r,c)
                        int[][] flipped = flip(cur, m, n, r, c);

                        // If this configuration hasn't been visited, add to queue
                        if (!visited.contains(arrayToString(flipped))) {
                            q.offer(flipped);
                            visited.add(arrayToString(flipped));
                        }
                    }
                }
            }

            steps++;
        }

        return -1;
    }

    private int[][] flip(int[][] mat, int m, int n, int r, int c) {
        int[][] flipped = new int[m][n];
        for (int i = 0; i < m; i++) {
            System.arraycopy(mat[i], 0, flipped[i], 0, n);
        }

        // Flip neighbors
        if (r - 1 >= 0) {
            flipped[r - 1][c] = 1 - flipped[r - 1][c];
        }
        if (r + 1 < m) {
            flipped[r + 1][c] = 1 - flipped[r + 1][c];
        }
        if (c - 1 >= 0) {
            flipped[r][c - 1] = 1 - flipped[r][c - 1];
        }
        if (c + 1 < n) {
            flipped[r][c + 1] = 1 - flipped[r][c + 1];
        }

        // Flip (r,c)
        flipped[r][c] = 1 - flipped[r][c];
        return flipped;
    }

    private boolean allZero(int[][] mat) {
        for (int[] row : mat) {
            for (int cell : row) {
                if (cell != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    private String arrayToString(int[][] arr) {
        StringBuilder sb = new StringBuilder();
        for (int[] row : arr) {
            for (int cell : row) {
                sb.append(cell);
            }
        }
        return sb.toString();
    }
}

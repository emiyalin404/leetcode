import java.util.LinkedList;
import java.util.Queue;

public class WallsAndGatesTwo {

    public void wallsAndGatesTwo(int[][] rooms) {
        int m = rooms.length;
        if (m == 0) {
            return;
        }
        int n = rooms[0].length;

        int[][] vectors = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (rooms[i][j] == 0) {
                    queue.offer(new int[] { i, j });
                }
            }
        }

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int i = current[0];
            int j = current[1];

            for (int[] vector : vectors) {
                int nextI = i + vector[0];
                int nextJ = j + vector[1];

                if (nextI < 0 || nextI >= m || nextJ < 0 || nextJ >= n || rooms[nextI][nextJ] <= rooms[i][j]) {
                    continue;
                }

                rooms[nextI][nextJ] = rooms[i][j] + 1;
                queue.offer(new int[] { nextI, nextJ });
            }
        }
    }

    public static void main(String[] args) {
        int[][] rooms = {
                { Integer.MAX_VALUE, -1, 0, Integer.MAX_VALUE },
                { Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, -1 },
                { Integer.MAX_VALUE, -1, Integer.MAX_VALUE, -1 },
                { 0, -1, Integer.MAX_VALUE, Integer.MAX_VALUE }
        };

        WallsAndGatesTwo solution = new WallsAndGatesTwo();
        solution.wallsAndGatesTwo(rooms);

        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[0].length; j++) {
                System.out.print(rooms[i][j] + " ");
            }
            System.out.println();
        }
    }

}

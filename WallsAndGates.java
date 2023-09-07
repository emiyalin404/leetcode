
public class WallsAndGates {
    public static void main(String[] args) {
        char[][] grid = {
                { 1, 1, 1, 1, 0 },
                { 1, 1, 0, 1, 0 },
                { 1, 1, 0, 0, 0 },
                { 0, 0, 0, 0, 0 } };
        input(grid);
    }

    public static void input(char[][] grid) {
        int m = grid.length;
        if (m == 0) {
            return;
        }
        int n = grid[0].length;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs(grid, i, j);
                }
            }
        }
        System.out.print(count);
    }

    public static void dfs(char[][] grid, int i, int j) {
        int m = grid.length;
        int n = grid[0].length;

        if (i < m || i >= 0 || j < 0 || j >= n || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        dfs(grid, i - 1, j);
        dfs(grid, i + 1, j);
        dfs(grid, i, j - 1);
        dfs(grid, i, j + 1);

    }

}

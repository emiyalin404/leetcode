public class Matrix {
    public static void main(String[] args) {
        int[][] mat = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
        input(mat);
    }

    public static void input(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int[][] result = new int[rows][cols];
        int maxDistance = rows + cols;
        if (mat == null || rows == 0 || rows == 1 && cols == 1) {
            System.out.println(mat);
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] != 0) {
                    result[i][j] = maxDistance;
                    if (i > 0) {
                        result[i][j] = Math.min(result[i][j], result[i - 1][j] + 1);
                    }
                    if (j > 0) {
                        result[i][j] = Math.min(result[i][j], result[i][j - 1] + 1);
                    }
                }
            }
        }

        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 0; j--) {
                if (i < rows - 1) {
                    result[i][j] = Math.min(result[i][j], result[i + 1][j] + 1);
                }
                if (j < cols - 1) {
                    result[i][j] = Math.min(result[i][j], result[i][j + 1] + 1);
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        // ----------------------------------------------------------------------------------
        // int rows = mat.length;
        // int cols = mat[0].length;
        // int[][] result = new int[rows][cols];
        // int maxDistance = rows + cols;
        // if (mat == null || rows == 0 || rows == 1 && cols == 1) {
        // System.out.println(mat);
        // }

        // for (int i = 0; i < rows; i++) {
        // for (int j = 0; j < cols; j++) {
        // if (mat[i][j] != 0) {
        // result[i][j] = maxDistance;
        // if (i > 0) {
        // result[i][j] = Math.min(result[i][j], result[i - 1][j] + 1);
        // // System.out.println(result[i][j]);
        // }
        // if (j > 0) {
        // result[i][j] = Math.min(result[i][j], result[i][j - 1] + 1);
        // }
        // }
        // }
        // }

        // for (int i = rows - 1; i >= 0; i--) {
        // for (int j = cols - 1; j >= 0; j--) {
        // if (i < rows - 1) {
        // result[i][j] = Math.min(result[i][j], result[i + 1][j] + 1);
        // }
        // if (j < cols - 1) {
        // result[i][j] = Math.min(result[i][j], result[i][j + 1] + 1);
        // }
        // }
        // }
        // System.out.println(result);
        // for (int i = 0; i < rows; i++) {
        // for (int j = 0; j < cols; j++) {
        // System.out.print(result[i][j] + " ");
        // }
        // System.out.println();
        // }
        // // return result;
    }
}

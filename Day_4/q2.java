package Week_1.Day_4;

public class q2 {
     public static int[][] matrixReshape(int[][] mat, int r, int c) {

        int m = mat.length;
        int n = mat[0].length;

        if (m * n != r * c) {
            return mat;
        }

        int[][] result = new int[r][c];

        for (int i = 0; i < m * n; i++) {
            result[i / c][i % c] = mat[i / n][i % n];
        }

        return result;
    }

    public static void main(String[] args) {

        int[][] mat = {
                {1, 2},
                {3, 4}
        };

        int[][] reshaped = matrixReshape(mat, 1, 4);

        System.out.println("Reshaped Matrix:");

        for (int[] row : reshaped) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

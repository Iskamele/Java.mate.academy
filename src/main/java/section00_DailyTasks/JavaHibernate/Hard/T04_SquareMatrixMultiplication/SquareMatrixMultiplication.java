package section00_DailyTasks.JavaHibernate.Hard.T04_SquareMatrixMultiplication;

public class SquareMatrixMultiplication {
    public static int[][] multiplySquareMatrices(int[][] a, int[][] b) {
        int[][] c = new int[a.length][a.length];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length ; j++) {
                for (int k = 0; k < c.length; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }
}

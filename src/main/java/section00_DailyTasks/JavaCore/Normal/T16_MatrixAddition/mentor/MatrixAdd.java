package section00_DailyTasks.JavaCore.Normal.T16_MatrixAddition.mentor;

public class MatrixAdd {
    public static int getSumOfElements(int[][] matrix) {
        int result = 0;
        for (int[] row : matrix) {
            for (int element : row) {
                result += element;
            }
        }
        return result;
    }
}

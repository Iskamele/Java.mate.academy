package section00_DailyTasks.JavaCore.Normal.T16_MatrixAddition;

import java.util.Arrays;

public class MatrixAdd {
    public static int getSumOfElements(int[][] matrix) {
        return Arrays.stream(matrix)
                .flatMapToInt(Arrays::stream)
                .sum();
    }
}

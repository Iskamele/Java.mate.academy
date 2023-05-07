package Daily.JavaCore.Normal.T16_MatrixAddition;

import section00_DailyTasks.JavaCore.Normal.T16_MatrixAddition.MatrixAdd;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MatrixAddTest {
    private static final Map<int[][], Integer> data = new HashMap<>();

    @BeforeClass
    public static void beforeClass() {
        data.put(new int[][]{{1, 0}, {0, 1}}, 2);
        data.put(new int[][]{{-2, -4}, {-6, -1}}, -13);
        data.put(new int[][]{{10, -12}, {-19, 30}}, 9);
        data.put(new int[][]{{0, 0}, {0, 0}, {0, 0}}, 0);
        data.put(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 45);
        data.put(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 2}}, 122);
    }

    @Test
    public void getSumOfElements_numbersInMatrix() {
        for (Map.Entry<int[][], Integer> entry : data.entrySet()) {
            int[][] input = entry.getKey();
            int expected = entry.getValue();
            int actual = MatrixAdd.getSumOfElements(input);
            Assert.assertEquals(String.format("Your method should return the result of addition %d for the matrix %s\n",
                    expected, Arrays.deepToString(input)), expected, actual);
        }
    }
}

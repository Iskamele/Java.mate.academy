package Daily.JavaCore.Normal.T21_SquareMatrixAddition;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;
import section00_DailyTasks.JavaCore.Normal.T21_SquareMatrixAddition.SquareMatrixAddition;

public class SquareMatrixAdditionTest {
    public static final String ERROR_MSG = "Result should be %s for input values: %s and %s\n";

    @Test
    public void addSquareMatrices_emptyArrays() {
        Assert.assertArrayEquals("Result should be [[]] for input values: [[]] and [[]]\n",
                new int[][]{}, SquareMatrixAddition.addSquareMatrices(new int[][]{}, new int[][]{}));
    }

    @Test
    public void addSquareMatrices_singleElementArrays() {
        int[][] firstSquare = new int[][]{{2}};
        int[][] secondSquare = new int[][]{{2}};
        int[][] resultSquare = new int[][]{{4}};
        Assert.assertArrayEquals(String.format(ERROR_MSG, getStringRepresentation(resultSquare),
                        getStringRepresentation(firstSquare), getStringRepresentation(secondSquare)),
                resultSquare, SquareMatrixAddition.addSquareMatrices(firstSquare, secondSquare));
    }

    @Test
    public void addSquareMatrices_twoElementArrays() {
        int[][] firstSquare = new int[][]{{1, 2}, {3, 4}};
        int[][] secondSquare = new int[][]{{5, 6}, {7, 8}};
        int[][] resultSquare = new int[][]{{6, 8}, {10, 12}};
        Assert.assertArrayEquals(String.format(ERROR_MSG, getStringRepresentation(resultSquare),
                        getStringRepresentation(firstSquare), getStringRepresentation(secondSquare)),
                resultSquare, SquareMatrixAddition.addSquareMatrices(firstSquare, secondSquare));
    }

    @Test
    public void addSquareMatrices_threeElementArrays() {
        int[][] firstSquare = new int[][]{{12, 48, 3}, {9, 11, 14}, {18, 33, 21}};
        int[][] secondSquare = new int[][]{{56, 12, 90}, {88, 61, 2}, {45, 72, 37}};
        int[][] resultSquare = new int[][]{{68, 60, 93}, {97, 72, 16}, {63, 105, 58}};
        Assert.assertArrayEquals(String.format(ERROR_MSG, getStringRepresentation(resultSquare),
                        getStringRepresentation(firstSquare), getStringRepresentation(secondSquare)),
                resultSquare, SquareMatrixAddition.addSquareMatrices(firstSquare, secondSquare));
    }

    @Test
    public void addSquareMatrices_fourElementArrays() {
        int[][] firstSquare = new int[][]{{11, 3, 5, 7}, {2, 6, 2, 9}, {15, 18, 4, 7}, {22, 16, 5, 3}};
        int[][] secondSquare = new int[][]{{-11, -3, -5, -7}, {-2, -6, -2, -9}, {-15, -18, -4, -7}, {-22, -16, -5, -3}};
        int[][] resultSquare = new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        Assert.assertArrayEquals(String.format(ERROR_MSG, getStringRepresentation(resultSquare),
                        getStringRepresentation(firstSquare), getStringRepresentation(secondSquare)),
                resultSquare, SquareMatrixAddition.addSquareMatrices(firstSquare, secondSquare));
    }

    @Test
    public void addSquareMatrices_fiveElementArrays() {
        int[][] firstSquare = new int[][]{{1, 4, 7, 9, 12}, {10, 7, 55, 12, 13}, {7, 81, 90, 17, 8}, {11, 2, 3, 1, 66}, {34, 52, 97, 8, 22}};
        int[][] secondSquare = new int[][]{{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        int[][] resultSquare = new int[][]{{2, 6, 10, 13, 17}, {16, 14, 63, 21, 23}, {18, 93, 103, 31, 23}, {27, 19, 21, 20, 86}, {55, 74, 120, 32, 47}};
        Assert.assertArrayEquals(String.format(ERROR_MSG, getStringRepresentation(resultSquare),
                        getStringRepresentation(firstSquare), getStringRepresentation(secondSquare)),
                resultSquare, SquareMatrixAddition.addSquareMatrices(firstSquare, secondSquare));
    }

    private String getStringRepresentation(int[][] matrix) {
        String[] rowsToString = new String[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            rowsToString[i] = Arrays.toString(matrix[i]);
        }
        return Arrays.toString(rowsToString);
    }

    ;
}

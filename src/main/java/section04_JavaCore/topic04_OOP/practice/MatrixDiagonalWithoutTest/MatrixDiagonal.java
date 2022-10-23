package section04_JavaCore.topic04_OOP.practice.MatrixDiagonalWithoutTest;

import java.util.Arrays;

public class MatrixDiagonal {
    public static void main(String[] args) {
        int[][] matrix =
                        {{0, 1, 2},
                        {4, 5, 6},
                        {1, 1, 1}};

        System.out.println(Arrays.toString(getDiagonal(matrix)));
        System.out.println(Arrays.toString(getCounterDiagonal(matrix)));

        int[][] secondMatrix =
                        {{-2, 31, 6, 7},
                        {15, -42, 1, 0},
                        {9, -7, 12, 19},
                        {55, 34, 1, -10}};

        System.out.println(Arrays.toString(getDiagonal(secondMatrix)));
        System.out.println(Arrays.toString(getCounterDiagonal(secondMatrix)));
    }

    private static int[] getDiagonal(int[][] matrix) {
        int[] diagonal = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            diagonal[i] = matrix[i][i];
        }
        return diagonal;
    }

    private static int[] getCounterDiagonal(int[][] matrix) {
        int[] counterDiagonal = new int[matrix.length];
        int index = 0;
        for (int i = matrix.length - 1; i > 0; i--) {
            counterDiagonal[index] = matrix[index][i];
            index++;
        }
        counterDiagonal[index] = matrix[index][0];
        return counterDiagonal;
    }
}

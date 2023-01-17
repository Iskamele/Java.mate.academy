package section04_JavaCore.topic15_ArrayPractice;

import java.util.Arrays;

public class MatrixAddition {
    public static void main(String[] args) {
        int[][] first = {{1, 2, 3, 4}, {3, 2, 1, 2}, {1, 1, 1, 0}};
        int[][] second = {{2, 2, 1, 2}, {3, 2, 3, 1}, {1, 1, 3, 5}};
        System.out.println(Arrays.deepToString(addMatrix(first, second)));
    }

    public static int[][] addMatrix(int[][] first, int[][] second) {
        if (first.length == 0) {
            return new int[0][0];
        }
        int[][] third = new int[first.length][first[0].length];
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[0].length; j++) {
                third[i][j] = first[i][j] + second[i][j];
            }
        }
        return third;
    }
}

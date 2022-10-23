package section04_JavaCore.topic04_OOP.practice.MatrixDiagonal;

public class MatrixDiagonal {
    public int[] getDiagonal(int[][] matrix) {
        int[] diagonal = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            diagonal[i] = matrix[i][i];
        }
        return diagonal;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
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

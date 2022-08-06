package section02_JavaBasicsExtended.topic03_ArraysExtended.practice;

public class MatrixMax {
    public static void main(String[] args) {
        System.out.println(getMaxElement(new int[][]{{3, 5, 7, 8}, {9, 6, 4, 3}}));
    }

    public static int getMaxElement(int[][] matrix) {
        int max = matrix[0][0];

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (max < anInt) {
                    max = anInt;
                }
            }
        }
        return max;
    }
}

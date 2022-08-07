package section02_JavaBasicsExtended.topic03_ArraysExtended.theory;

public class PrintAllMatrixElements {
    public static void main(String[] args) {
        // matrix has two rows and four columns
        int[][] matrix = new int[][]{
                {-4, 5, -1, 10},
                {10, 1, 11, 70}
        };

        // print each element on the new line

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(i + " " + j + " = " + matrix[i][j]);
            }
        }
    }
}

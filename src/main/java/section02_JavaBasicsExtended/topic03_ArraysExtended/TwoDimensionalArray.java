package section02_JavaBasicsExtended.topic03_ArraysExtended;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        // Two dimensional array
        // 1    2   3   4
        // 1    2   3   4

        int[][] matrix = new int[2][4];
        String[][]cinema = new String [2][4];
        cinema[0][0] = "Bob";
        cinema[0][1] = "Alice";
        cinema[1][1] = "Olga";
        cinema[1][2] = "John";

        System.out.println(cinema[0][2]);
    }
}

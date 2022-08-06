package section02_JavaBasicsExtended.topic03_ArraysExtended.practice;

public class GetNeighboursCells {
    public static void main(String[] args) {
        int rowIndex = 1;
        int columnIndex = 1;
        int[][] array = {{2, 3, 5},
                {1, 7, 1},
                {5, 9, 2}};

        int neighboursCellsSum = array[rowIndex - 1][columnIndex] +
                array[rowIndex][columnIndex + 1] +
                array[rowIndex + 1][columnIndex] +
                array[rowIndex][columnIndex - 1];

        System.out.println(neighboursCellsSum);
    }
}

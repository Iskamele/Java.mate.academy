package section01_JavaBasics.topic09_Arrays.practice;

import java.util.Arrays;

public class CreateNewArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createArray(5)));
    }
    public static int[] createArray(int n) {
        int[] numbers = new int[n];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = 1 + i;
        }
        return numbers;
    }
}

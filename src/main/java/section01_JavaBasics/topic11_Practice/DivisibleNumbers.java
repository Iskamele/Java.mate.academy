package section01_JavaBasics.topic11_Practice;

import java.util.Arrays;

public class DivisibleNumbers {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getDivisibleNumbers(new int[]{2, 5, 8, 0, 7, 1, -4}, 2)));
        System.out.println(Arrays.toString(getDivisibleNumbers(new int[]{0, 11, 9, -3, 7, 22, -1, -22, 113, 741, 32}, -12)));
    }

    public static int[] getDivisibleNumbers(int[] numbers, int divider) {
        int destinationSize = 0;
        for (int number : numbers) {
            if (number % divider == 0 && number > 0) {
                destinationSize++;
            }
        }
        int index = 0;
        int[] result = new int[destinationSize];
        for (int number : numbers) {
            if (number % divider == 0 && number > 0) {
                result[index] = number;
                index++;
            }
        }
        return result;
    }
}

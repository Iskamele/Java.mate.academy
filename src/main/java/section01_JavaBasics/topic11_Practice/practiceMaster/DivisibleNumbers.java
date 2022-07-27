package section01_JavaBasics.topic11_Practice.practiceMaster;

import java.util.Arrays;

public class DivisibleNumbers {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getDivisibleNumbers(new int[]{2, 5, 8, 0, 7, 1, -4}, 2)));
        System.out.println(Arrays.toString(getDivisibleNumbers(new int[]{0, 11, 9, -3, 7, 22, -1, -22, 113, 741, 32}, -12)));
    }

    public static int[] getDivisibleNumbers(int[] numbers, int divider) {
        // first, we calculate the amount of elements that met required conditions
        int size = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0 && numbers[i] > 0) {
                size++;
            }
        }
        // to reuse the variable we will first create resulting array and then decrease size value by 1
        int[] result = new int[size--];
    /*
        that's the same loop to iterate throught every element just from an end to a start.
        We start from the last index and decrease its value until we hit first index (0)
     */
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] % divider == 0 && numbers[i] > 0) {
        /*
            'size' represents the current index in result array and 'i' represents the current index
            in numbers since 2 arrays have different length we need 2 variables
         */
                result[size--] = numbers[i];
            }
        }
        return result;
    }
}
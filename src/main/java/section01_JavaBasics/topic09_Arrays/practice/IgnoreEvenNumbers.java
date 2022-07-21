package section01_JavaBasics.topic09_Arrays.practice;

import java.util.Arrays;

public class IgnoreEvenNumbers {
    public static void main(String[] args) {
        int[] array = {3, 5, 0, 8, 7};
        System.out.println(getSum(array));
    }

    public static int getSum(int[] numbers) {
        int answer = 0;

        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 != 0){
                answer+=numbers[i];
            }
        }
        return answer;
    }
}
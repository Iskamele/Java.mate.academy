package section01_JavaBasics.topic09_Arrays.practice;

import java.util.Arrays;

public class SpeedStatistic {
    public static void main(String[] args) {
        int[] array1 = {0,12,10};
        int[] array2 = {18,2};
        int[] array3 = {1,2,2,3,3,3,3,18};
        int[] array4 = {9,9,9,9};
        int[] array5 = {10};
        int[] array6 = {};

        System.out.println(Arrays.toString(getSpeedStatistic(array1)));
        System.out.println(Arrays.toString(getSpeedStatistic(array2)));
        System.out.println(Arrays.toString(getSpeedStatistic(array3)));
        System.out.println(Arrays.toString(getSpeedStatistic(array4)));
        System.out.println(Arrays.toString(getSpeedStatistic(array5)));
        System.out.println(Arrays.toString(getSpeedStatistic(array6)));
    }

    public static int[] getSpeedStatistic(int[] results) {
        int minSpeed = Integer.MAX_VALUE;
        int maxSpeed = Integer.MIN_VALUE;
        int arraySize = 2;

        int[] answer = new int[arraySize];

        if (results.length == 0){
            answer[0] = 0;
            answer[1] = 0;
            return answer;
        }

        for (int result : results) {
            if (minSpeed > result) {
                minSpeed = result;
            }
            if (maxSpeed < result) {
                maxSpeed = result;
            }
        }
        answer[0] = minSpeed;
        if (results.length != 1) {
            answer[1] = maxSpeed;
        } else {
            answer[1] = answer[0];
        }
        return answer;
    }
}
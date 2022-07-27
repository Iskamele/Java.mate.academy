package section01_JavaBasics.topic09_Arrays.practiceMaster;

import java.util.Arrays;

public class SpeedStatistic {
    public static void main(String[] args) {
        int[] array1 = {0, 12, 10};
        int[] array2 = {18, 2};
        int[] array3 = {1, 2, 2, 3, 3, 3, 3, 18};
        int[] array4 = {9, 9, 9, 9};
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
        if (results.length == 0){
            return new int[2];
        }

        int[] responce = new int[2];
        int max = results[0];
        int min = results[0];

        for (int speed : results) {
            if (speed > max) {
                max = speed;
            }
            if (speed < min){
                min = speed;
            }
        }

        responce[0] = min;
        responce[1] = max;

        return responce;
    }
}

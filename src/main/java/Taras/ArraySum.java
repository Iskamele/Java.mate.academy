package Taras;

import java.util.Arrays;

public class ArraySum {
    public static void main(String[] args) {
        System.out.println("Fold 1 time");
        System.out.println(Arrays.toString(sum(new int[]{1, 2, 3, 4, 5}, 1))); // 6 6 3
        System.out.println(Arrays.toString(sum(new int[]{5, 3, 4, 3, 1, 5}, 1))); // 10 4 7
        System.out.println(Arrays.toString(sum(new int[]{0, 0, 0, 0, 1}, 1))); // 1 0 0
        System.out.println(Arrays.toString(sum(new int[]{0}, 1))); // 0
        System.out.println();
        System.out.println("Fold 2 times");
        System.out.println(Arrays.toString(sum(new int[]{1, 2, 3, 4, 5}, 2))); // 9 6
        System.out.println(Arrays.toString(sum(new int[]{5, 3, 4, 3, 1, 5}, 2))); // 17 4
        System.out.println(Arrays.toString(sum(new int[]{0, 0, 0, 0, 1}, 2))); // 1 0
        System.out.println(Arrays.toString(sum(new int[]{0}, 2))); // 0
        System.out.println();
        System.out.println("Fold 3 times");
        System.out.println(Arrays.toString(sum(new int[]{1, 2, 3, 4, 5}, 3))); //
        System.out.println(Arrays.toString(sum(new int[]{5, 3, 4, 3, 1, 5}, 3))); //
        System.out.println(Arrays.toString(sum(new int[]{0, 0, 0, 0, 1}, 3))); //
        System.out.println(Arrays.toString(sum(new int[]{0}, 2))); //
    }

    public static int[] sum(int[] array, int times) {
        do {
            for (int i = 0; i < array.length / 2; i++) {
                int temp = array[i];
                array[i] += array[array.length - i - 1];
                array[array.length - i - 1] = temp;
            }
            times--;
            array = (array.length % 2 != 0) ? Arrays.copyOf(array, array.length / 2 + 1) : Arrays.copyOf(array, array.length / 2);
        } while (0 < times);
        return array;
    }
}


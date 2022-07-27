package section01_JavaBasics.topic09_Arrays.practice;

import java.util.Arrays;

public class DoublePower {
    public static void main(String[] args) {
        int[] array = {45, 34, 56, 67};
        System.out.println(Arrays.toString(getDoublePower(array)));
    }

    public static int[] getDoublePower(int[] powers) {
        for (int i = 0; i < powers.length; i++) {
            powers[i] = powers[i] * 2;
        }
        return powers;
    }
}


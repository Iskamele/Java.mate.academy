package section01_JavaBasics.topic09_Arrays.telegram;

import java.util.Arrays;

public class EmptyArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createEmpryArray(0)));
        System.out.println(Arrays.toString(createEmpryArray(3)));
        System.out.println(Arrays.toString(createEmpryArray(7)));
    }

    private static String[] createEmpryArray(int length) {
        String[] array = new String[length];
        return array;
    }
}

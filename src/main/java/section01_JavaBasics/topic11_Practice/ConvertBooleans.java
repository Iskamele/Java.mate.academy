package section01_JavaBasics.topic11_Practice;

import java.util.Arrays;

public class ConvertBooleans {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getStringArray(new boolean[]{true, false}))); // ["Yes", "No"]
        System.out.println(Arrays.toString(getStringArray(new boolean[]{false}))); // ["No"]
        System.out.println(Arrays.toString(getStringArray(new boolean[]{}))); // []
    }

    public static String[] getStringArray(boolean[] values) {
        String[] array = new String[values.length];
        int index = 0;
        for (boolean value : values) {
            if (value) {
                array[index++] = "Yes";
            } else {
                array[index++] = "No";
            }
        }
        return array;
    }
}



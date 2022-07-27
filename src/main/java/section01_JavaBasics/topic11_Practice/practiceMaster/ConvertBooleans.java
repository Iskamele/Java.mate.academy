package section01_JavaBasics.topic11_Practice.practiceMaster;

import java.util.Arrays;

public class ConvertBooleans {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getStringArray(new boolean[]{true, false}))); // ["Yes", "No"]
        System.out.println(Arrays.toString(getStringArray(new boolean[]{false}))); // ["No"]
        System.out.println(Arrays.toString(getStringArray(new boolean[]{}))); // []
    }

    public static String[] getStringArray(boolean[] values) {
        String[] result = new String[values.length];
        for (int i = 0; i < values.length; i++) {
            result[i] = values[i] ? "Yes" : "No";
        }
        return result;
    }
}
package section01_JavaBasics.topic11_Practice.practiceMaster;

import java.util.Arrays;

public class CombineArrays {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getCombinedArray(new int[]{1, 2}, new int[]{3, 4}))); // [1, 2, 3, 4]
        System.out.println(Arrays.toString(getCombinedArray(new int[]{56}, new int[]{-32}))); // [56, -32]
        System.out.println(Arrays.toString(getCombinedArray(new int[]{}, new int[]{}))); // []
        System.out.println(Arrays.toString(getCombinedArray(new int[]{}, new int[]{20, 10}))); // [20, 10]
        System.out.println(Arrays.toString(getCombinedArray(new int[]{}, new int[]{18, 19}))); // [20, 10]
    }

    public static int[] getCombinedArray(int[] firstArray, int[] secondArray) {
        int[] result = new int[firstArray.length + secondArray.length];
        int index = 0;
        for (int element : firstArray) {
            result[index] = element;
            index++;
        }
        for (int element : secondArray) {
            result[index] = element;
            index++;
        }
        return result;
    }
}

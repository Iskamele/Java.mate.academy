package section01_JavaBasics.topic11_Practice;

import java.util.Arrays;

public class CombineArrays {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getCombinedArray(new int[]{1, 2}, new int[]{3, 4}))); // [1, 2, 3, 4]
        System.out.println(Arrays.toString(getCombinedArray(new int[]{56}, new int[]{-32}))); // [56, -32]
        System.out.println(Arrays.toString(getCombinedArray(new int[]{}, new int[]{}))); // []
        System.out.println(Arrays.toString(getCombinedArray(new int[]{}, new int[]{20, 10}))); // [20, 10]
        System.out.println(Arrays.toString(getCombinedArray(new int[]{}, new int[]{18, 19}))); // [20, 10]
    }

    /*public static int[] getCombinedArray(int[] firstArray, int[] secondArray) {
        int[] destination = Arrays.copyOf(firstArray, firstArray.length + secondArray.length);
        int index = 0;
        for (int i = firstArray.length; i < firstArray.length + secondArray.length; i++) {
            destination[i] = secondArray[index++];
        }
        return destination;
    }*/

    public static int[] getCombinedArray(int[] firstArray, int[] secondArray) {
        int[] destination = new int[firstArray.length + secondArray.length];

        System.arraycopy(firstArray, 0, destination, 0, firstArray.length);
        System.arraycopy(secondArray, 0, destination, firstArray.length, secondArray.length);

        return destination;
    }
}
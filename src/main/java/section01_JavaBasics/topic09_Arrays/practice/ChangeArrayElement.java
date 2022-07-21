package section01_JavaBasics.topic09_Arrays.practice;

import java.util.Arrays;

public class ChangeArrayElement {
    public static void main(String[] args) {
        String[] array = {"pineapple", "apple", "cherry", "pear"};
        System.out.println(Arrays.toString(changeArrayElement(array)));
    }

    public static String[] changeArrayElement(String[] fruits) {
        fruits[0] = "plum";
        return fruits;
    }
}

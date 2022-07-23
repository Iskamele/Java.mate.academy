package section01_JavaBasics.topic10_String.practice;

public class StringToUpperCase {
    public static void main(String[] args) {
        String str = "Hello World!";

        System.out.println(stringToUpperCase(str));
    }

    public static String stringToUpperCase(String input) {
        String getUpperCase = input.toUpperCase();

        return getUpperCase;
    }
}
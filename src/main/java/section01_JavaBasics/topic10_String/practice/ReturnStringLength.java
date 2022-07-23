package section01_JavaBasics.topic10_String.practice;

public class ReturnStringLength {
    public static void main(String[] args) {
        String str = "Hello World!";

        System.out.println(returnStringLength(str));
    }

    public static int returnStringLength(String input) {
        int stringLength = input.length();
        return stringLength;
    }
}

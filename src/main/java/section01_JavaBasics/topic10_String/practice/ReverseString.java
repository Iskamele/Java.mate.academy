package section01_JavaBasics.topic10_String.practice;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello World";

        System.out.println(reverseString(str));
    }

    public static String reverseString(String input) {
        StringBuilder builder = new StringBuilder(input);
        builder = builder.reverse();

        String answer = builder.toString();
        return answer;
    }
}
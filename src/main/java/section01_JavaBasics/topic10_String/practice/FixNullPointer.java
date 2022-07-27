package section01_JavaBasics.topic10_String.practice;

public class FixNullPointer {
    public static void main(String[] args) {
        System.out.println(getUpperCase("national aeronautics space administration"));
        System.out.println(getUpperCase("central processing unit"));
        System.out.println(getUpperCase(null));
    }
    public static String getUpperCase(String inputString) {
                return (inputString == null) ? "The string is null!" : inputString.toUpperCase();}}
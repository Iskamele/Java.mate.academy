package section01_JavaBasics.topic10_String.practice;

public class CreateGreeting {
    public static void main(String[] args) {
        String str = "World!";

        System.out.println(createGreeting(str));
    }

    public static String createGreeting(String input) {
        StringBuilder builder = new StringBuilder("Hello, ");
        builder.append(input);
        String answer = builder.toString();
        return answer;
    }
}
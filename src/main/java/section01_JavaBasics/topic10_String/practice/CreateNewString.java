package section01_JavaBasics.topic10_String.practice;

public class CreateNewString {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(createNewString(str));
    }

    public static String createNewString(String input) {
        StringBuilder builder = new StringBuilder();
        char[] chars = input.toCharArray();
        builder.append(chars[1]).append(chars[3]);

        String answer = builder.toString();
        return answer;
    }
}

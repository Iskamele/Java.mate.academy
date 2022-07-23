package section01_JavaBasics.topic10_String.practice;

public class CombineStrings {
    public static void main(String[] args) {
        String str1 = "Hello ";
        String str2 = "World!";

        System.out.println(combineStrings(str1, str2));
    }

    public static String combineStrings(String one, String two) {
        StringBuilder builder = new StringBuilder();
        builder.append(one).append(two);
        String answer = builder.toString();
        return answer;
    }
}
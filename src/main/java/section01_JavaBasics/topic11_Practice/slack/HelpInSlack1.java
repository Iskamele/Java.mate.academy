package section01_JavaBasics.topic11_Practice.slack;

public class HelpInSlack1 {
    public static void main(String[] args) {
        System.out.println(removeOddChars("hello")); // hlo
        System.out.println(removeOddChars("1234")); // 13
        System.out.println(removeOddChars("(())")); // ()
        System.out.println(removeOddChars("Bob")); // Bb
        System.out.println(removeOddChars(""));
    }

    public static String removeOddChars(String originalString) {
        if (originalString.isEmpty()) {
            return originalString;
        }
        char[] array = originalString.toCharArray();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                builder.append(array[i]);
            }
        }
        return builder.toString();
    }
}

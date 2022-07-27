package section01_JavaBasics.topic11_Practice.slack;

public class HelpInSlack1_2 {
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

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < originalString.length(); i++) {
            if (i % 2 == 0) {
                builder.append(originalString.charAt(i));

            }
        }
        return builder.toString();
    }
}
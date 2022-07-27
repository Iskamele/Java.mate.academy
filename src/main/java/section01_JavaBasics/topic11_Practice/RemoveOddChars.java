package section01_JavaBasics.topic11_Practice;

public class RemoveOddChars {
    public static void main(String[] args) {
        System.out.println(removeOddChars("hello").equals("hlo")); // hlo
        System.out.println(removeOddChars("1234").equals("13")); // 13
        System.out.println(removeOddChars("(())").equals("()")); // ()
        System.out.println(removeOddChars("Bob").equals("Bb")); // Bb
        System.out.println(removeOddChars("").equals(""));
        System.out.println(removeOddChars("My_Mom_Is_Proud").equals("M_o_sPod")); //M_o_sPod

    }

    public static String removeOddChars(String originalString) {
        if (originalString.length() == 0) {
            return "";
        }

        StringBuilder builder = new StringBuilder();
        builder.append(originalString.charAt(0));

        for (int i = 1; i < originalString.length(); i++) {
            if (i % 2 == 0) {
                builder.append(originalString.charAt(i));
            }
        }
        return builder.toString();
    }
}

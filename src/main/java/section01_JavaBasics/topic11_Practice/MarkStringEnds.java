package section01_JavaBasics.topic11_Practice;

import java.util.Arrays;

public class MarkStringEnds {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(markStringEnds("hello")));
        System.out.println(Arrays.toString(markStringEnds("example")));
        System.out.println(Arrays.toString(markStringEnds("Bob")));
        System.out.println(Arrays.toString(markStringEnds("ALICE")));
        System.out.println(Arrays.toString(markStringEnds("wow!")));
        System.out.println(Arrays.toString(markStringEnds("o")));
    }

    public static String[] markStringEnds(String originalString) {

        return new String[]{originalString.toUpperCase().charAt(0) + originalString.substring(1),
                originalString.substring(0, originalString.length()-1) + originalString.toUpperCase().charAt(originalString.length()-1)};
    }
}

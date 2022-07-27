package section01_JavaBasics.topic11_Practice.practiceMaster;

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
        // last letter index is needed to extract last char and to form second part of result
        int lastIndex = originalString.length() - 1;

        // get first letter in CAPS, hello -> H
        String firstChar = originalString.substring(0, 1).toUpperCase();
        // get last letter in CAPS, hello -> O
        String lastChar = originalString.substring(lastIndex).toUpperCase();

        // add CAPS first letter to original string starting from second letter
        String firstEnd = firstChar + originalString.substring(1);

        // add original string except last letter with CAPS last letter
        String secondEnd = originalString.substring(0, lastIndex) + lastChar;

        // combine two words into result array
        return new String[]{firstEnd, secondEnd};
    }
}

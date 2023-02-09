package section04_JavaCore.topic20_StreamAPIPractice.practice.UppercaseStringFromArray;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UppercaseString {
    private static final int MIN_LENGTH = 3;
    private static final char FIRST_STARTING_LETTER = 'a';
    private static final char SECOND_STARTING_LETTER = 'b';
    private static final Predicate<String> predicate = str ->
            str.length() >= MIN_LENGTH
                    && (str.charAt(0) == FIRST_STARTING_LETTER
                    || str.charAt(0) == SECOND_STARTING_LETTER);

    public static List<String> getUppercaseString(String[] sourceStrings) {
        return Stream.of(sourceStrings)
                .filter(predicate)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}

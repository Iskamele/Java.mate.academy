package section04_JavaCore.topic20_StreamAPIPractice.practice.FilterAndModifyLetters;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FilterAndModifyLetters {
    public static String filterLetters(String input) {
        return IntStream.range(0, input.length())
                .filter(i -> i % 2 == 0)
                .mapToObj(i -> String.valueOf(input.charAt(i)))
                .collect(Collectors.joining())
                .toUpperCase();
    }
}

package section00_DailyTasks.JavaCore.Normal.T15_ReverseWords;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWords {
    public static String reverseWords(final String string) {
        if (string.trim().isEmpty()) {
            return string;
        }
        return Arrays.stream(string.split("\\s"))
                .map(s -> new StringBuilder(s).reverse().toString())
                .collect(Collectors.joining(" "));
    }
}


package section00_DailyTasks.JavaCore.Normal.T12_HighestAndLowest;

import java.util.Arrays;

public class HighestAndLowest {
    private static final String REGEX = "\\s";

    public static String highAndLow(String numbers) {
        int[] numbersArray = Arrays.stream(numbers.split(REGEX))
                .mapToInt(Integer::parseInt)
                .toArray();
        int max = Arrays.stream(numbersArray)
                .max()
                .orElse(0);
        int min = Arrays.stream(numbersArray)
                .min()
                .orElse(0);
        return String.format("%s %s", max, min);
    }
}

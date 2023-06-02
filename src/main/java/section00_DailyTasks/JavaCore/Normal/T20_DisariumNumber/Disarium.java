package section00_DailyTasks.JavaCore.Normal.T20_DisariumNumber;

import java.util.stream.IntStream;

public class Disarium {
    public static boolean isDisarium(int number) {
        int[] numbers = String.valueOf(number).chars()
                .map(Character::getNumericValue)
                .toArray();
        int disarium = IntStream.range(0, numbers.length)
                .map(i -> (int) Math.pow(numbers[i], i + 1))
                .sum();
        return disarium == number;
    }
}

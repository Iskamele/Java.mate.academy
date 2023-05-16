package section00_DailyTasks.JavaHibernate.Hard.T03_WeightForWeight;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class WeightSort {
    public static String orderWeights(String weights) {
        if (weights == null || weights.isEmpty()) {
            return "";
        }
        Integer[] numbers = Arrays.stream(weights.trim().split("\\s+"))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);
        Arrays.sort(numbers, Comparator.comparingInt(WeightSort::calculateWeight)
                .thenComparing(Object::toString));
        return Arrays.stream(numbers)
                .map(String::valueOf)
                .collect(Collectors.joining(" "));
    }

    private static int calculateWeight(int number) {
        int weight = 0;
        while (number > 0) {
            weight += number % 10;
            number /= 10;
        }
        return weight;
    }
}

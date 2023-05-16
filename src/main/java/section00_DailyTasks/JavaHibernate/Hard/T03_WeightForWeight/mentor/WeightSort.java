package section00_DailyTasks.JavaHibernate.Hard.T03_WeightForWeight.mentor;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WeightSort {
    public static String orderWeights(String weights) {
        return Stream.of(weights.trim().split(" +"))
                .sorted()
                .sorted(Comparator.comparingInt(o -> o.chars().map(Character::getNumericValue).sum()))
                .collect(Collectors.joining(" "));
    }
}

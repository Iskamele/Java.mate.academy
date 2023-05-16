package section00_DailyTasks.JavaHibernate.Hard.T03_WeightForWeight;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class WeightSortFirstImplementation {
    public static String orderWeights(String weights) {
        if (weights.isEmpty()) {
            return weights;
        }
        Comparator<Integer> weightComparator = (num1, num2) -> {
            int firstWeight = calculateWeight(num1);
            int secondWeight = calculateWeight(num2);
            if (firstWeight != secondWeight) {
                return Integer.compare(firstWeight, secondWeight);
            } else {
                return num1.toString().compareTo(num2.toString());
            }
        };
        Integer[] numbers = Arrays.stream(weights.trim().split("\\s+"))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);
        Arrays.sort(numbers, weightComparator);
        return Arrays.stream(numbers).map(String::valueOf).collect(Collectors.joining(" "));
    }

    private static int calculateWeight(int number) {
        int weight = 0;
        String numString = Integer.toString(number);
        for (char digit : numString.toCharArray()) {
            weight += Character.getNumericValue(digit);
        }
        return weight;
    }
}

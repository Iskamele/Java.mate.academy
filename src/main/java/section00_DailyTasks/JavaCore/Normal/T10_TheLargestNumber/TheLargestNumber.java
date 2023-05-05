package section00_DailyTasks.JavaCore.Normal.T10_TheLargestNumber;

import java.util.Comparator;
import java.util.stream.Collectors;

public class TheLargestNumber {
    public static long getMaxNumber(long num) {
        String sortedNum = String.valueOf(num)
                .chars()
                .mapToObj(Character::getNumericValue)
                .sorted(Comparator.reverseOrder())
                .map(String::valueOf)
                .collect(Collectors.joining());
        return Long.parseLong(sortedNum);
    }
}

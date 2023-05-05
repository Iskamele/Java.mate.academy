package section00_DailyTasks.JavaCore.Normal.T13_FormTheMinimumNumber;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MinimumValue {
    public static int getMinValue(int[] nums) {
        String temp = Arrays.stream(nums)
                .distinct()
                .sorted()
                .mapToObj(Integer::toString)
                .collect(Collectors.joining());
        return Integer.parseInt(temp);
    }
}

package section00_DailyTasks.JavaCore.Easy.T12_SumOfSquares;

import java.util.Arrays;

public class SumOfSquare {
    public static int getSquareSum(int[] nums) {
        return Arrays.stream(nums)
                .map(i -> i * i)
                .sum();
    }
}

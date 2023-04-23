package section00_DailyTasks.JavaCore.Easy.T12_SumOfSquares.Mentor;

public class SumOfSquare {
    public static int getSquareSum(int[] nums) {
        int sum = 0;
        for (int n : nums) {
            sum += n * n;
        }
        return sum;
    }
}

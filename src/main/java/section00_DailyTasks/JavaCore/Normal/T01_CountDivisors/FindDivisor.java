package section00_DailyTasks.JavaCore.Normal.T01_CountDivisors;

public class FindDivisor {
    public static int countDivisors(int number) {
        int result = 1;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                result++;
            }
        }
        return result;
    }
}

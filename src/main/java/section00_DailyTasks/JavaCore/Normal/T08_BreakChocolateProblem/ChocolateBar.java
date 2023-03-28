package section00_DailyTasks.JavaCore.Normal.T08_BreakChocolateProblem;

public class ChocolateBar {
    public static int breakChocolate(int n, int m) {
        return (n <= 1 && m <= 1) ? 0 : n * m - 1;
    }
}

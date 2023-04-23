package section00_DailyTasks.JavaCore.Easy.T13_SimpleMultiplication;

public class SimpleMultiplication {
    public static int multiplyNumber(int num) {
        if (num % 2 == 0) {
            return num * 8;
        } else {
            return num * 9;
        }
    }
}

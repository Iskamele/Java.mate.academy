package section00_DailyTasks.JavaWeb.Normal.T02_IsSquareNumber;

public class SquareNumber {
    public static boolean isSquare(int number) {
        if (number < 0) {
            return false;
        }
        int i = 1;
        while (number > 0) {
            number -= i;
            i += 2;
        }
        return number == 0;
    }
}

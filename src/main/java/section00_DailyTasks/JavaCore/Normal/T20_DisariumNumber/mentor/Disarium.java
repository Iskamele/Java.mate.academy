package section00_DailyTasks.JavaCore.Normal.T20_DisariumNumber.mentor;

public class Disarium {
    public static boolean isDisarium(int number) {
        int sum = 0;
        char[] digits = String.valueOf(number).toCharArray();
        for (int i = 0; i < digits.length; i++) {
            sum += Math.pow(digits[i] - '0', i + 1);
        }
        return sum == number;
    }
}

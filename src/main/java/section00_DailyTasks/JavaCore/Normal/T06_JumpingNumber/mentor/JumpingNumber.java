package section00_DailyTasks.JavaCore.Normal.T06_JumpingNumber.mentor;

public class JumpingNumber {
    public static String isJumping(int number) {
        char[] digits = Integer.toString(number).toCharArray();
        for (int i = 0; i < digits.length - 1; i++) {
            if (Math.abs(digits[i + 1] - digits[i]) != 1)
                return "Not!!";
        }
        return "Jumping!!";
    }
}

package section00_DailyTasks.JavaCore.Normal.T06_JumpingNumber;

public class JumpingNumber {
    public static String isJumping(int number) {
        String stringFromInt = Integer.toString(number);
        int[] array = new int[stringFromInt.length()];
        for (int i = 0; i < stringFromInt.length(); i++) {
            array[i] = stringFromInt.charAt(i);
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 9 && array[i + 1] == 0) {
                continue;
            }
            int result = array[i] - array[i + 1];
            if (result == -1) {
                result = 1;
            }
            if (result != 1) {
                return "Not!!";
            }
        }
        return "Jumping!!";
    }
}

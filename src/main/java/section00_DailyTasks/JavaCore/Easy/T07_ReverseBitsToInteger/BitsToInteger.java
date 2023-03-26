package section00_DailyTasks.JavaCore.Easy.T07_ReverseBitsToInteger;

public class BitsToInteger {
    public static int reverseBitsToInteger(int number) {
     return Integer.parseInt(String.valueOf(new StringBuilder(Integer.toBinaryString(number)).reverse()), 2);
    }
}

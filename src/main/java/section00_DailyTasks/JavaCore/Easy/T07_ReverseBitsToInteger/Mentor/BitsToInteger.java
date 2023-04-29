package section00_DailyTasks.JavaCore.Easy.T07_ReverseBitsToInteger.Mentor;

public class BitsToInteger {
    public static int reverseBitsToInteger(int number) {
        char[] bits = Integer.toBinaryString(number).toCharArray();
        String reversedBits = "";
        for (int i = bits.length - 1; i >= 0; i--) {
            reversedBits += bits[i];
        }
        return Integer.parseInt(reversedBits, 2);
    }
}

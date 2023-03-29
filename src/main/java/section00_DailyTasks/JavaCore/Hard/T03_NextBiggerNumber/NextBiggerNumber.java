package section00_DailyTasks.JavaCore.Hard.T03_NextBiggerNumber;

import java.util.Arrays;

public class NextBiggerNumber {
    public static int getNextBiggerNumber(int n) {
        char[] digits = String.valueOf(n).toCharArray();
        int i = digits.length - 1;
        while (i > 0 && digits[i - 1] >= digits[i]) {
            i--;
        }
        if (i == 0) {
            return -1;
        }
        int j = digits.length - 1;
        while (i > 0 && digits[j] <= digits[i - 1]) {
            j--;
        }
        char temp = digits[i - 1];
        digits[i - 1] = digits[j];
        digits[j] = temp;
        Arrays.sort(digits, i, digits.length);
        return Integer.parseInt(new String(digits));
    }
}

package section00_DailyTasks.JavaCore.Normal.T10_TheLargestNumber.mentor;

import java.util.Arrays;

public class TheLargestNumber {
    public static long getMaxNumber(long num) {
        String temp = Long.toString(num);
        char[] charArr = temp.toCharArray();
        Arrays.sort(charArr);

        StringBuilder result = new StringBuilder();
        for (int count = 0; count != charArr.length; count++) {
            result.append(charArr[charArr.length - count - 1]);
        }

        return Long.parseLong(result.toString());
    }
}

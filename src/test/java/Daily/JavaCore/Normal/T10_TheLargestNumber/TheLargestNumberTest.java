package Daily.JavaCore.Normal.T10_TheLargestNumber;

import section00_DailyTasks.JavaCore.Normal.T10_TheLargestNumber.TheLargestNumber;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class TheLargestNumberTest {
    @Test
    public void getMaxNumber_oneDigit() {
        Assert.assertEquals(String.format("The result should be %d for the number %d\n",
                7, 7), 7, TheLargestNumber.getMaxNumber(7));
    }

    @Test
    public void getMaxNumber_twoDigits() {
        Assert.assertEquals(String.format("The result should be %d for the number %d\n",
                21, 12), 21, TheLargestNumber.getMaxNumber(12));
    }

    @Test
    public void getMaxNumber_duplicatedDigits() {
        Assert.assertEquals(String.format("The result should be %d for the number %d\n",
                442, 424), 442, TheLargestNumber.getMaxNumber(424));
    }

    @Test
    public void getMaxNumber_longNumber() {
        Assert.assertEquals(String.format("The result should be %d for the number %d\n",
                987665431, 134976658), 987665431, TheLargestNumber.getMaxNumber(134976658));
    }

    @Test
    public void getMaxNumber_randomNumber() {
        long randomNum = (long) (Math.random() * ((1000 - 500) + 1)) + 500;
        long expected = gettingMax(randomNum);

        Assert.assertEquals(String.format("The result should be %d for the number %d\n",
                expected, randomNum), expected, TheLargestNumber.getMaxNumber(randomNum));
    }

    private static long gettingMax(long num) {
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

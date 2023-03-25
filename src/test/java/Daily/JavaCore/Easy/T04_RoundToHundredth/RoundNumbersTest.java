package Daily.JavaCore.Easy.T04_RoundToHundredth;

import org.junit.Assert;
import org.junit.Test;
import section00_DailyTasks.JavaCore.Easy.T04_RoundToHundredth.RoundNumbers;

public class RoundNumbersTest {
    @Test
    public void roundToHundredth_roundToSmaller() {
        Assert.assertEquals("Method should round a number to two decimal places to smaller\n",
                11.97, RoundNumbers.roundToHundredth(11.973), 0.00);
    }

    @Test
    public void roundToHundredth_roundToGreater() {
        Assert.assertEquals("Method should round a number to two decimal places to greater\n",
                3.48, RoundNumbers.roundToHundredth(3.47621), 0.00);
    }

    @Test
    public void roundToHundredth_roundToGreaterEndsWith5() {
        Assert.assertEquals("Method should round a number to two decimal places to greater if it ends with 5\n",
                55.55, RoundNumbers.roundToHundredth(55.545), 0.00);
    }

    @Test
    public void roundToHundredth_roundToSmallerEndsWith1() {
        Assert.assertEquals("Method should round a number to smaller if it ends with 01\n",
                0.0, RoundNumbers.roundToHundredth(0.001), 0.00);
    }

    @Test
    public void roundToHundredth_roundToGreaterEndsWith99() {
        Assert.assertEquals("Method should round a number to one decimal place to greater if it ends with 99\n",
                29.3, RoundNumbers.roundToHundredth(29.299), 0.00);
    }

    @Test
    public void roundToHundredth_roundNegativeNumber() {
        Assert.assertEquals("Method should round a negative number to two decimal places\n",
                -512.34, RoundNumbers.roundToHundredth(-512.34203342), 0.00);
    }

    @Test
    public void roundToHundredth_alreadyRounded() {
        Assert.assertEquals("Method should not modify the number which is already rounded to two decimal places\n",
                3.14, RoundNumbers.roundToHundredth(3.14), 0.00);
    }
}

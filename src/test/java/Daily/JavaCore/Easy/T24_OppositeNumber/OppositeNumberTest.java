package Daily.JavaCore.Easy.T24_OppositeNumber;

import section00_DailyTasks.JavaCore.Easy.T24_OppositeNumber.OppositeNumber;
import org.junit.Assert;
import org.junit.Test;

public class OppositeNumberTest {
    @Test
    public void oppositeNumber_getOppositeForNegative() {
        int expected = -1;
        int actual = OppositeNumber.oppositeNumber(1);

        Assert.assertEquals("Should return the opposite number for the positive number\n",
                expected, actual);
    }

    @Test
    public void oppositeNumber_getOppositeForPositive() {
        int expected = 14;
        int actual = OppositeNumber.oppositeNumber(-14);

        Assert.assertEquals("Should return the opposite number for the negative number\n",
                expected, actual);
    }

    @Test
    public void oppositeNumber_getOppositeForZero() {
        int expected = 0;
        int actual = OppositeNumber.oppositeNumber(0);
        Assert.assertEquals(
                "Should return the same number when there is no opposite\n", expected, actual);
    }
}

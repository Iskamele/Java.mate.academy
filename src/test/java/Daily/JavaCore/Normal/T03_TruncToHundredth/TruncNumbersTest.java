package Daily.JavaCore.Normal.T03_TruncToHundredth;

import org.junit.Assert;
import org.junit.Test;
import section00_DailyTasks.JavaCore.Normal.T03_TruncToHundredth.TruncNumbers;

public class TruncNumbersTest {
    @Test
    public void truncateToHundredth_truncSmaller() {
        Assert.assertEquals("Method should truncate a number to two decimal places if it is closer to a smaller number\n",
                14.31, TruncNumbers.truncateToHundredth(14.312), 0.00);
    }

    @Test
    public void truncateToHundredth_truncGreater() {
        Assert.assertEquals("Method should truncate a number to two decimal places if it is closer to a greater number\n",
                99.38, TruncNumbers.truncateToHundredth(99.3873), 0.00);
    }

    @Test
    public void truncateToHundredth_truncGreaterEndsWith5() {
        Assert.assertEquals("Method should truncate a number to two decimal places if it ends with 5\n",
                2.65, TruncNumbers.truncateToHundredth(2.655), 0.00);
    }

    @Test
    public void truncateToHundredth_truncNegativeNumber() {
        Assert.assertEquals("Method should truncate a negative number to two decimal places\n",
                -35.93, TruncNumbers.truncateToHundredth(-35.9321), 0.00);
    }

    @Test
    public void truncateToHundredth_alreadyTruncated() {
        Assert.assertEquals("MMethod should not modify the number which is already truncated to two decimal places\n",
                0.44, TruncNumbers.truncateToHundredth(0.44), 0.00);
    }
}

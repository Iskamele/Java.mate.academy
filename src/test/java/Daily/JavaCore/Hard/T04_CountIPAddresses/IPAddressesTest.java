package Daily.JavaCore.Hard.T04_CountIPAddresses;

import org.junit.Assert;
import org.junit.Test;
import section00_DailyTasks.JavaCore.Hard.T04_CountIPAddresses.IPAddresses;

public class IPAddressesTest {
    @Test
    public void countIPBetween_oneAddress() {
        String start = "150.0.0.0";
        String end = "150.0.0.1";
        long expected = 1;
        long actual = IPAddresses.countIPBetween(start, end);
        Assert.assertEquals(String.format("The result should be %d for start = \"%s\" and end = \"%s\"\n",
                expected, start, end), expected, actual);
    }

    @Test
    public void countIPBetween_fiftyAddresses() {
        String start = "10.0.0.0";
        String end = "10.0.0.50";
        long expected = 50;
        long actual = IPAddresses.countIPBetween(start, end);
        Assert.assertEquals(String.format("The result should be %d for start = \"%s\" and end = \"%s\"\n",
                expected, start, end), expected, actual);
    }

    @Test
    public void countIPBetween_twoHundredAddresses() {
        String start = "20.0.0.10";
        String end = "20.0.1.0";
        long expected = 246;
        long actual = IPAddresses.countIPBetween(start, end);
        Assert.assertEquals(String.format("The result should be %d for start = \"%s\" and end = \"%s\"\n",
                expected, start, end), expected, actual);
    }

    @Test
    public void countIPBetween_largeNumber() {
        String start = "50.0.0.0";
        String end = "50.1.1.1";
        long expected = 65793;
        long actual = IPAddresses.countIPBetween(start, end);
        Assert.assertEquals(String.format("The result should be %d for start = \"%s\" and end = \"%s\"\n",
                expected, start, end), expected, actual);
    }

    @Test
    public void countIPBetween_longNumber() {
        String start = "1.2.3.4";
        String end = "5.6.7.8";
        long expected = 67372036;
        long actual = IPAddresses.countIPBetween(start, end);
        Assert.assertEquals(String.format("The result should be %d for start = \"%s\" and end = \"%s\"\n",
                expected, start, end), expected, actual);
    }
}

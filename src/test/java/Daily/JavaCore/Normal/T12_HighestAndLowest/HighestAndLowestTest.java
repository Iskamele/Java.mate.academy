package Daily.JavaCore.Normal.T12_HighestAndLowest;

import section00_DailyTasks.JavaCore.Normal.T12_HighestAndLowest.HighestAndLowest;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class HighestAndLowestTest {
    private static final Map<String, String> data = new HashMap<>();

    @BeforeClass
    public static void beforeClass() {
        data.put("20", "20 20");
        data.put("-2", "-2 -2");
        data.put("-5 1", "1 -5");
        data.put("1 2 3", "3 1");
        data.put("-1 -2 -3 -4 -5 -6", "-1 -6");
        data.put("30 40 12 90 121 23 120 11", "121 11");
        data.put("0 0 0 0 0 0 0", "0 0");
        data.put("0 -4 -6 -8", "0 -8");
        data.put("0 4 6 8", "8 0");
    }

    @Test
    public void highAndLow_numbersInString() {
        for (Map.Entry<String, String> entry : data.entrySet()) {
            String input = entry.getKey();
            String expected = entry.getValue();
            String actual = HighestAndLowest.highAndLow(input);
            Assert.assertEquals(String.format("Your method should return a result \"%s\" for the string \"%s\"",
                    expected, input), expected, actual);
        }
    }
}

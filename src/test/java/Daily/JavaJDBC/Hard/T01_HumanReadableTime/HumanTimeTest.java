package Daily.JavaJDBC.Hard.T01_HumanReadableTime;

import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import section00_DailyTasks.JavaJDBC.Hard.T01_HumanReadableTime.HumanTime;

public class HumanTimeTest {
    private static final Map<Integer, String> data = new HashMap<>();

    @BeforeClass
    public static void beforeClass() {
        data.put(0, "00:00:00");
        data.put(1, "00:00:01");
        data.put(59, "00:00:59");
        data.put(60, "00:01:00");
        data.put(90, "00:01:30");
        data.put(180, "00:03:00");
        data.put(3599, "00:59:59");
        data.put(3600, "01:00:00");
        data.put(12345, "03:25:45");
        data.put(86399, "23:59:59");
        data.put(359999, "99:59:59");
    }

    @Test
    public void convertTime_fromIntToString() {
        for (Map.Entry<Integer, String> entry : data.entrySet()) {
            int input = entry.getKey();
            String expected = entry.getValue();
            String actual = HumanTime.convertTime(input);
            Assert.assertEquals(String.format("Your method should return a string with time \"%s\" for %d seconds\n",
                    expected, input), expected, actual);
        }
    }
}

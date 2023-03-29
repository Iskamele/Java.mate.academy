package Daily.JavaCore.Hard.T03_NextBiggerNumber;

import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import section00_DailyTasks.JavaCore.Hard.T03_NextBiggerNumber.NextBiggerNumber;

public class NextBiggerNumberTest {
    private static final Map<Integer, Integer> data = new HashMap<>();

    @BeforeClass
    public static void beforeClass() {
        data.put(12, 21);
        data.put(514, 541);
        data.put(2018, 2081);
        data.put(626, 662);
        data.put(377, 737);
        data.put(20550, 25005);
        data.put(123456789, 123456798);
        data.put(992575701, 992575710);
        data.put(1283331765, 1283335167);
        data.put(4, -1);
        data.put(83, -1);
        data.put(999, -1);
    }

    @Test
    public void getNextBiggerNumber_inputInteger() {
        for (Map.Entry<Integer, Integer> entry : data.entrySet()) {
            int input = entry.getKey();
            int expected = entry.getValue();
            int actual = NextBiggerNumber.getNextBiggerNumber(input);
            Assert.assertEquals(String.format("The result should be %d for the input number %d\n",
                    expected, input), expected, actual);
        }
    }
}

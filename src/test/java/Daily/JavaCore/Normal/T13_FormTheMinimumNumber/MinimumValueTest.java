package Daily.JavaCore.Normal.T13_FormTheMinimumNumber;

import section00_DailyTasks.JavaCore.Normal.T13_FormTheMinimumNumber.MinimumValue;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MinimumValueTest {
    private static final Map<int[], Integer> data = new HashMap<>();

    @BeforeClass
    public static void beforeClass() {
        data.put(new int[]{1, 2}, 12);
        data.put(new int[]{4, 3}, 34);
        data.put(new int[]{4, 7, 5, 7}, 457);
        data.put(new int[]{8, 9, 5, 1}, 1589);
        data.put(new int[]{1, 1, 1, 1, 1, 1, 1}, 1);
        data.put(new int[]{6, 7, 8, 7, 6, 6}, 678);
    }

    @Test
    public void getMinValue_digitsInArray() {
        for (Map.Entry<int[], Integer> entry : data.entrySet()) {
            int[] input = entry.getKey();
            int expected = entry.getValue();
            int actual = MinimumValue.getMinValue(input);
            Assert.assertEquals(String.format("Your method should return a number %d for the array \"%s\"",
                    expected, Arrays.toString(input)), expected, actual);
        }
    }
}

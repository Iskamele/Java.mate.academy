package Daily.JavaCore.Easy.T23_NumberToReversedArray;

import section00_DailyTasks.JavaCore.Easy.T23_NumberToReversedArray.ArrayReverse;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArrayReverseTest {
    private static final Map<Long, int[]> data = new HashMap<>();

    @BeforeClass
    public static void beforeClass() {
        data.put(1L, new int[]{1});
        data.put(12L, new int[]{2, 1});
        data.put(140L, new int[]{0, 4, 1});
        data.put(4318L, new int[]{8, 1, 3, 4});
        data.put(66666L, new int[]{6, 6, 6, 6, 6});
        data.put(108156L, new int[]{6, 5, 1, 8, 0, 1});
        data.put(1046774L, new int[]{4, 7, 7, 6, 4, 0, 1});
        data.put(1765783198L, new int[]{8, 9, 1, 3, 8, 7, 5, 6, 7, 1});
    }

    @Test
    public void toReversedArray_numberToDigits() {
        for (Map.Entry<Long, int[]> entry : data.entrySet()) {
            long input = entry.getKey();
            int[] expected = entry.getValue();
            int[] actual = ArrayReverse.toReversedArray((int) input);
            Assert.assertEquals(String.format("The reversed array should be \"%s\" for the input number %d\n",
                    Arrays.toString(expected), input), Arrays.toString(expected), Arrays.toString(actual));
        }
    }
}

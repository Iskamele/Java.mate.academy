package Daily.JavaWeb.Normal.T04_SeparateWheatFromChaff;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import section00_DailyTasks.JavaWeb.Normal.T04_SeparateWheatFromChaff.WheatAndChaff;

public class WheatAndChaffTest {
    private static final Map<long[], long[]> data = new HashMap<>();

    @BeforeClass
    public static void beforeClass() {
        data.put(new long[]{}, new long[]{});
        data.put(new long[]{-1, -1, -1}, new long[]{-1, -1, -1});
        data.put(new long[]{9, 9, 20}, new long[]{9, 9, 20});
        data.put(new long[]{7, -3, -10}, new long[]{-10, -3, 7});
        data.put(new long[]{7, -8, 1, -2}, new long[]{-2, -8, 1, 7});
        data.put(new long[]{-3, 4, -10, 2, -6}, new long[]{-3, -6, -10, 2, 4});
        data.put(new long[]{-46, -17, -48, -5, -21}, new long[]{-46, -17, -48, -5, -21});
        data.put(new long[]{-30, -11, 36, 38, 34, -5, -50}, new long[]{-30, -11, -50, -5, 34, 38, 36});
        data.put(new long[]{-25, -48, -29, -25, 1, 49, -32, -19, -46, 1},
                new long[]{-25, -48, -29, -25, -46, -19, -32, 49, 1, 1});
        data.put(new long[]{-17, 7, -12, 10, 4, -8, -19, -24, 40, 31, -29, 21, -45, 1},
                new long[]{-17, -45, -12, -29, -24, -8, -19, 4, 40, 31, 10, 21, 7, 1});
    }

    @Test
    public void separateWheatFromChaff_PositivesAndNegatives() {
        for (Map.Entry<long[], long[]> entry : data.entrySet()) {
            long[] input = entry.getKey();
            long[] expected = entry.getValue();
            long[] actual = WheatAndChaff.separateWheatFromChaff(input);
            Assert.assertArrayEquals(String.format("The result should be %s for the input array %s\n",
                    Arrays.toString(expected), Arrays.toString(input)), expected, actual);
        }
    }
}

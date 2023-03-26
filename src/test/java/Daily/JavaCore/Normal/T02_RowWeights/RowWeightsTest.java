package Daily.JavaCore.Normal.T02_RowWeights;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import section00_DailyTasks.JavaCore.Normal.T02_RowWeights.RowWeights;

public class RowWeightsTest {
    private static Map<int[], int[]> data = new HashMap<>();

    @BeforeClass
    public static void beforeClass() {
        data.put(new int[]{80}, new int[]{80, 0});
        data.put(new int[]{100, 50}, new int[]{100, 50});
        data.put(new int[]{50, 60, 70, 80}, new int[]{120, 140});
        data.put(new int[]{13, 27, 49}, new int[]{62, 27});
        data.put(new int[]{101, 51, 50, 100}, new int[]{151, 151});
        data.put(new int[]{39, 84, 74, 18, 59, 72, 35, 61}, new int[]{207, 235});
        data.put(new int[]{29, 83, 67, 53, 19, 28, 96}, new int[]{211, 164});
    }

    @Test
    public void getTotalWeight_countTotalWeight() {
        for (Map.Entry<int[], int[]> entry : data.entrySet()) {
            int[] input = entry.getKey();
            int[] expected = entry.getValue();
            int[] actual = RowWeights.getTotalWeight(input);
            Assert.assertArrayEquals(String.format("Your method should return an array of total weights \"%s\" for the row weights \"%s\"\n",
                    Arrays.toString(expected), Arrays.toString(input)), expected, actual);
        }
    }
}

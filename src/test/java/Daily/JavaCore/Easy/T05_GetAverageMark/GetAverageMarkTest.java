package Daily.JavaCore.Easy.T05_GetAverageMark;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import section00_DailyTasks.JavaCore.Easy.T05_GetAverageMark.GetAverageMark;

public class GetAverageMarkTest {
    private static final Map<int[], Integer> data = new HashMap<>();

    @BeforeClass
    public static void beforeClass() {
        data.put(new int[]{1, 2, 3, 4, 5}, 3);
        data.put(new int[]{6, 6, 6, 6}, 6);
        data.put(new int[]{5, 7, 8, 7, 3, 9}, 6);
        data.put(new int[]{7, 7, 7, 8, 8, 8}, 7);
        data.put(new int[]{5, 6, 8, 9, 4, 4, 7, 5, 2, 5, 10}, 5);
        data.put(new int[]{4}, 4);
    }

    @Test
    public void getAverageMark_marksInArray() {
        for (Map.Entry<int[], Integer> entry : data.entrySet()) {
            int[] input = entry.getKey();
            int expected = entry.getValue();
            int actual = GetAverageMark.getAverageMark(input);
            Assert.assertEquals(String.format("Your method should return a number %d for the array \"%s\"",
                    expected, Arrays.toString(input)), expected, actual);
        }
    }
}

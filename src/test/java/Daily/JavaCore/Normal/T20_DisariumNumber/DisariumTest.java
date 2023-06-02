package Daily.JavaCore.Normal.T20_DisariumNumber;

import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import section00_DailyTasks.JavaCore.Normal.T20_DisariumNumber.Disarium;

public class DisariumTest {
    private static final Map<Integer, Boolean> data = new HashMap<>();

    @BeforeClass
    public static void beforeClass() {
        data.put(1, true);
        data.put(2, true);
        data.put(9, true);
        data.put(10, false);
        data.put(27, false);
        data.put(89, true);
        data.put(99, false);
        data.put(120, false);
        data.put(135, true);
        data.put(256, false);
        data.put(518, true);
    }

    @Test
    public void isDisarium_marksInArray() {
        for (Map.Entry<Integer, Boolean> entry : data.entrySet()) {
            int input = entry.getKey();
            boolean expected = entry.getValue();
            boolean actual = Disarium.isDisarium(input);
            Assert.assertEquals(String.format("Your method should return %b for the number %d",
                    expected, input), expected, actual);
        }
    }
}

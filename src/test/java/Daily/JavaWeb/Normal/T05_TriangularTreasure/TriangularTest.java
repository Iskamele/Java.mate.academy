package Daily.JavaWeb.Normal.T05_TriangularTreasure;

import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import section00_DailyTasks.JavaWeb.Normal.T05_TriangularTreasure.Triangular;

public class TriangularTest {
    private static final Map<Integer, Integer> data = new HashMap<>();

    @BeforeClass
    public static void beforeClass() {
        data.put(1, 1);
        data.put(2, 3);
        data.put(3, 6);
        data.put(4, 10);
        data.put(5, 15);
        data.put(8, 36);
        data.put(25, 325);
        data.put(1041, 542361);
        data.put(0, 0);
        data.put(-3, 0);
    }

    @Test
    public void getTriangular_inputNumber() {
        for (Map.Entry<Integer, Integer> entry : data.entrySet()) {
            int input = entry.getKey();
            int expected = entry.getValue();
            int actual = Triangular.getTriangular(input);
            Assert.assertEquals(String.format("The method should return %d for the input %d\n",
                    expected, input), expected, actual);
        }
    }
}

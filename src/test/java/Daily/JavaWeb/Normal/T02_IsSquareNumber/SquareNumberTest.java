package Daily.JavaWeb.Normal.T02_IsSquareNumber;

import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import section00_DailyTasks.JavaWeb.Normal.T02_IsSquareNumber.SquareNumber;

public class SquareNumberTest {
    private static final Map<Integer, Boolean> data = new HashMap<>();

    @BeforeClass
    public static void beforeClass() {
        data.put(0, true);
        data.put(-1, false);
        data.put(3, false);
        data.put(4, true);
        data.put(16, true);
        data.put(-16, false);
        data.put(25, true);
        data.put(26, false);
        data.put(68644, true);
        data.put(73984, true);
        data.put(81234, false);
        data.put(-90321, false);
    }

    @Test
    public void isSquare_checkForIntegers() {
        for (Map.Entry<Integer, Boolean> entry : data.entrySet()) {
            int input = entry.getKey();
            boolean expected = entry.getValue();
            boolean actual = SquareNumber.isSquare(input);
            Assert.assertEquals(String.format("The result should be %b fot the input number %d\n",
                    expected, input), expected, actual);
        }
    }
}

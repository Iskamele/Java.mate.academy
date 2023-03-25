
package Daily.JavaCore.Easy.T02_ConvertToKPM;

import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import section00_DailyTasks.JavaCore.Easy.T02_ConvertToKPM.Converter;

public class ConverterTest {
    private static final Map<Float, Float> data = new HashMap<>();

    @BeforeClass
    public static void beforeClass() {
        data.put(10f, 3.54f);
        data.put(20f, 7.08f);
        data.put(24f, 8.5f);
        data.put(30f, 10.62f);
        data.put(36f, 12.74f);
    }

    @Test
    public void toKiloPerLiter_convertToKPM() {
        for (Map.Entry<Float, Float> entry : data.entrySet()) {
            float input = entry.getKey();
            float expected = entry.getValue();
            float actual = Converter.toKiloPerLiter(input);
            Assert.assertEquals(String.format("The kpl should be %f for the mpg = %f", expected, input),
                    expected, actual, 0.001f);
        }
    }
}

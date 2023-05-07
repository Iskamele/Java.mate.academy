package Daily.JavaCore.Normal.T17_BreakCamelCase;

import section00_DailyTasks.JavaCore.Normal.T17_BreakCamelCase.CamelCase;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CamelCaseTest {
    private static final Map<String, String> data = new HashMap<>();

    @BeforeClass
    public static void beforeClass() {
        data.put("aB", "a B");
        data.put("mateAcademy", "mate Academy");
        data.put("camelCasingTest", "camel Casing Test");
        data.put("chicken", "chicken");
    }

    @Test
    public void breakCamelCase_stringInCamelCase() {
        for (Map.Entry<String, String> entry : data.entrySet()) {
            String input = entry.getKey();
            String expected = entry.getValue();
            String actual = CamelCase.breakCamelCase(input);
            Assert.assertEquals(String.format("The result should be \"%s\" for the input string \"%s\"\n",
                    expected, input), expected, actual);
        }
    }

    @Test
    public void breakCamelCase_emptyString() {
        Assert.assertEquals(String.format("The result should be \"%s\" for the empty input string\n", ""),
                "", CamelCase.breakCamelCase(""));
    }
}

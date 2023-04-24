package Daily.JavaCore.Easy.T16_RemoveAllDots;

import section00_DailyTasks.JavaCore.Easy.T16_RemoveAllDots.Replacer;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ReplacerTest {
    private static final Map<String, String> data = new HashMap<>();

    @BeforeClass
    public static void beforeClass() {
        data.put("one.two.three", "one-two-three");
        data.put("1.1", "1-1");
        data.put("no dots.allowed", "no dots-allowed");
        data.put(".dot", "-dot");
        data.put("dot_at_the_end.", "dot_at_the_end-");
        data.put(".....", "-----");
    }

    @Test
    public void replaceDots_replaceDotsInString() {
        for (Map.Entry<String, String> entry : data.entrySet()) {
            String input = entry.getKey();
            String expected = entry.getValue();
            String actual = Replacer.replaceDots(input);
            Assert.assertEquals(String.format("Your method should return a string \"%s\" for the \"%s\"\n",
                    expected, input), expected, actual);
        }
    }

    @Test
    public void replaceDots_noDotsInString() {
        Assert.assertEquals(String.format("Your method should return a string \"%s\" without changes\n", "no-dots here!"),
                "no-dots here!", Replacer.replaceDots("no-dots here!"));
    }
}

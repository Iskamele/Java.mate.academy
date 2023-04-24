package Daily.JavaCore.Easy.T14_SmashWords;

import section00_DailyTasks.JavaCore.Easy.T14_SmashWords.SmashWords;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SmashWordsTest {
    private static Map<String[], String> data = new HashMap<>();

    @BeforeClass
    public static void beforeClass() {
        data.put(new String[]{"Chicken"}, "Chicken");
        data.put(new String[]{"Mate", "academy"}, "Mate academy");
        data.put(new String[]{"Arrays", "are", "fun,", "but", "dangerous"}, "Arrays are fun, but dangerous");
    }

    @Test
    public void makeSentence_wordsInArray() {
        for (Map.Entry<String[], String> entry : data.entrySet()) {
            String[] input = entry.getKey();
            String expected = entry.getValue();
            String actual = SmashWords.makeSentence(input);
            Assert.assertEquals(String.format("Your method should return an \"%s\" for the \"%s\"",
                    expected, Arrays.toString(input)), expected, actual);
        }
    }

    @Test
    public void makeSentence_emptyArray() {
        Assert.assertEquals("Your method should return an empty string for the empty array of words",
                "", SmashWords.makeSentence(new String[]{}));
    }
}

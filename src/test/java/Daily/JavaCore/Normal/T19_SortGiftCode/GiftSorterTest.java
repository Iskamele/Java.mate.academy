package Daily.JavaCore.Normal.T19_SortGiftCode;

import section00_DailyTasks.JavaCore.Normal.T19_SortGiftCode.GiftSorter;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class GiftSorterTest {
    private static final Map<String, String> data = new HashMap<>();

    @BeforeClass
    public static void beforeClass() {
        data.put("z", "z");
        data.put("abcdef", "abcdef");
        data.put("fedcba", "abcdef");
        data.put("pqksuvy", "kpqsuvy");
        data.put("zyxwvutsrqponmlkjihgfedcba", "abcdefghijklmnopqrstuvwxyz");
    }

    @Test
    public void sortGiftCode_toAlphabeticalOrder() {
        for (Map.Entry<String, String> entry : data.entrySet()) {
            String input = entry.getKey();
            String expected = entry.getValue();
            String actual = GiftSorter.sortGiftCode(input);
            Assert.assertEquals(String.format("The result should be \"%s\" for the input code \"%s\"",
                    expected, input), expected, actual);
        }
    }
}

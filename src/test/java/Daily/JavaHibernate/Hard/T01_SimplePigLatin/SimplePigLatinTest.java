package Daily.JavaHibernate.Hard.T01_SimplePigLatin;

import java.util.HashMap;
import java.util.Map;
import section00_DailyTasks.JavaHibernate.Hard.T01_SimplePigLatin.SimplePigLatin;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SimplePigLatinTest {
    private static final Map<String, String> data = new HashMap<>();

    @BeforeClass
    public static void beforeClass() {
        data.put("d", "day");
        data.put("word", "ordway");
        data.put("Uppercase", "ppercaseUay");
        data.put("Test this", "estTay histay");
        data.put("The sentence of five words", "heTay entencesay foay ivefay ordsway");
        data.put("Mate academy !", "ateMay cademyaay !");
        data.put("Veni , vidi , vici", "eniVay , idivay , icivay");
        data.put("?", "?");
        data.put("", "");
    }

    @Test
    public void toSimplePigLatin_convertInput() {
        for (Map.Entry<String, String> entry : data.entrySet()) {
            String input = entry.getKey();
            String expected = entry.getValue();
            String actual = SimplePigLatin.toSimplePigLatin(input);
            Assert.assertEquals(String.format("The result should be \"%s\" for the input string \"%s\"\n",
                    expected, input), expected, actual);
        }
    }
}

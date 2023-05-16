package Daily.JavaHibernate.Hard.T03_WeightForWeight;

import section00_DailyTasks.JavaHibernate.Hard.T03_WeightForWeight.WeightSort;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class WeightSortTest {
    private static final Map<String, String> data = new HashMap<>();

    @BeforeClass
    public static void beforeClass() {
//        data.put("100", "100");
//        data.put("105 107", "105 107");
//        data.put("21 101", "101 21");
//        data.put("90 81", "81 90");
//        data.put("50 50 50", "50 50 50");
//        data.put("90 98 99 100 101 102", "100 101 102 90 98 99");
//        data.put("80 44 53 404 26 800 71", "26 404 44 53 71 80 800");
//        data.put("38 18 90 45 200 107 403 93 7000 284", "200 403 7000 107 18 45 90 38 93 284");
        data.put("  102 903 111111 392 66 399 10003", "102 10003 111111 66 903 392 399");
     //   data.put("500 600 1003 41 800000 ", "1003 41 500 600 800000");
       // data.put("18 27 63  45 81 72", "18 27 45 63 72 81");
        data.put("", "");
    }

    @Test
    public void orderWeights_weightsString() {
        for (Map.Entry<String, String> entry : data.entrySet()) {
            String input = entry.getKey();
            String expected = entry.getValue();
            String actual = WeightSort.orderWeights(input);
            Assert.assertEquals(String.format("The result should be \"%s\" for the input string \"%s\"\n",
                    expected, input), expected, actual);
        }
    }
}

package Daily.JavaJDBC.Easy.T10_SumStream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import section00_DailyTasks.JavaJDBC.Easy.T10_SumStream.SumStream;

public class SumStreamTest {
    private static final String NEW_LIST_REGEX = ".*if.*|.*for.*|.*while.*|.*newArrayList.*|.*newLinkedList.*";
    private static String resultCode;
    private static final Map<List<Integer>, Integer> data = new HashMap<>();

    @BeforeClass
    public static void beforeClass() {
        //resultCode = Solution.getSolution().replaceAll("\\s", "");

        data.put(List.of(), 0);
        data.put(List.of(9), 0);
        data.put(List.of(10), 0);
        data.put(List.of(11), 11);
        data.put(Arrays.asList(1, 2, -3, 5, 0), 0);
        data.put(Arrays.asList(1, 2, 3, 4, 10, 12, 14), 26);
        data.put(Arrays.asList(-15, -4, -3, -2, -1), 0);
        data.put(Arrays.asList(-4, -3, 10, 15, 17), 32);
    }

    @Test
    public void sumStream_integersInList() {
        for (Map.Entry<List<Integer>, Integer> entry : data.entrySet()) {
            List<Integer> input = entry.getKey();
            int expected = entry.getValue();
            int actual = SumStream.sumStream(input);
            Assert.assertEquals(String.format("The result should be %d for the input list %s\n",
                    expected, input), expected, actual);
        }
    }

//  @Test
//  public void solution_containsHardcoding() {
//    Assert.assertEquals("You should not create a List by yourself or use loops. Use Stream API methods.\n",
//      false, resultCode.matches(NEW_LIST_REGEX));
//  }
}

package Daily.JavaHibernate.Normal.T01_DefangingIpAddress;

import section00_DailyTasks.JavaHibernate.Normal.T01_DefangingIpAddress.IPDefanger;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class IPDefangerTest {
    private static final Map<String, String> data = new HashMap<>();

    @BeforeClass
    public static void beforeClass() {
        data.put("1.1.1.1", "1[.]1[.]1[.]1");
        data.put("150.0.0.0", "150[.]0[.]0[.]0");
        data.put("10.0.0.50", "10[.]0[.]0[.]50");
        data.put("50.1.1.1", "50[.]1[.]1[.]1");
        data.put("255.100.50.0", "255[.]100[.]50[.]0");
    }

    @Test
    public void defangIPAddress_checkStrings() {
        for (Map.Entry<String, String> entry : data.entrySet()) {
            String input = entry.getKey();
            String expected = entry.getValue();
            String actual = IPDefanger.defangIPAddress(input);
            Assert.assertEquals(String.format("Your method should return a string \"%s\" for the input string \"%s\"\n",
                    expected, input), expected, actual);
        }
    }
}

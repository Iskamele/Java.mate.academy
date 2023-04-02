package Daily.JavaJDBC.Normal.T01_ValidPhoneNumber;

import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import section00_DailyTasks.JavaJDBC.Normal.T01_ValidPhoneNumber.PhoneNumber;

public class PhoneNumberTest {
    private static final Map<String, Boolean> data = new HashMap<>();

    @BeforeClass
    public static void beforeClass() {
        data.put("(357) 206-2912", true);
        data.put("(306)122-5924", false);
        data.put("a(793) 567-2501", false);
        data.put("(274) 6l5-4008", false);
        data.put("(599) 418-3418", true);
        data.put("578 216-5813", false);
        data.put("(846) 129 6430", false);
        data.put("(6723) 140-368", false);
        data.put("(141) 0893-533", false);
        data.put("(802) 667-1299", true);
        data.put(" (777) 777-7777", false);
        data.put("{309} 394-2958", false);
        data.put("(234) 279.5011", false);
    }

    @Test
    public void isValid_phoneNumberString() {
        for (Map.Entry<String, Boolean> entry : data.entrySet()) {
            String input = entry.getKey();
            boolean expected = entry.getValue();
            boolean actual = PhoneNumber.isValid(input);
            Assert.assertEquals(String.format("The method should return %b for the input string %s\n",
                    expected, input), expected, actual);
        }
    }
}

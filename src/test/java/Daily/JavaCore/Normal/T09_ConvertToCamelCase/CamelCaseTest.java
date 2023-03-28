package Daily.JavaCore.Normal.T09_ConvertToCamelCase;

import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import section00_DailyTasks.JavaCore.Normal.T09_ConvertToCamelCase.CamelCase;

public class CamelCaseTest {
    private static final Map<String, String> data = new HashMap<>();

    @BeforeClass
    public static void beforeClass() {
        data.put("camelCase", "camelCase");
        data.put("PascalCase", "PascalCase");
        data.put("big-data", "bigData");
        data.put("new_variable", "newVariable");
        data.put("Forget-Me-Not", "ForgetMeNot");
        data.put("Java_script", "JavaScript");
        data.put("convert-This-to-camel-case-please", "convertThisToCamelCasePlease");
        data.put("And_this_string_too_it_seems_so_long", "AndThisStringTooItSeemsSoLong");
        data.put("now_we_need-to-Deal-With-mixed_cases_And-delimiters_take-Them_into-account", "nowWeNeedToDealWithMixedCasesAndDelimitersTakeThemIntoAccount");
        data.put("", "");
    }

    @Test
    public void convertToCamelCase_inputString() {
        for (Map.Entry<String, String> entry : data.entrySet()) {
            String input = entry.getKey();
            String expected = entry.getValue();
            String actual = CamelCase.convertToCamelCase(input);
            Assert.assertEquals(String.format("The method should return %s for the input string %s\n",
                    expected, input), expected, actual);
        }
    }
}

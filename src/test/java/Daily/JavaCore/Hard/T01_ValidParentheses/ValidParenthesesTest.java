package Daily.JavaCore.Hard.T01_ValidParentheses;

import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import section00_DailyTasks.JavaCore.Hard.T01_ValidParentheses.ValidParentheses;

public class ValidParenthesesTest {
    private static final Map<String, Boolean> data = new HashMap<>();

    @BeforeClass
    public static void beforeClass() {
        data.put("()", true);
        data.put("())", false);
        data.put("(abc())", true);
        data.put(")(()))", false);
        data.put("(uF,7O);B", true);
        data.put("no parentheses", true);
        data.put("()()())()()(()())()", false);
        data.put("()())(", false);
        data.put(")(", false);
        data.put(")()(", false);
        data.put(":(.A((o))(m@(()B(?AndW))`)mr)dM8.", true);
    }

    @Test
    public void isValidParentheses_parenthesesInString() {
        for (Map.Entry<String, Boolean> entry : data.entrySet()) {
            String input = entry.getKey();
            boolean expected = entry.getValue();
            boolean actual = ValidParentheses.isValidParentheses(input);
            Assert.assertEquals(String.format("The result should be %b for the input string \"%s\"\n",
                    expected, input), expected, actual);
        }
    }

    @Test
    public void isValidParentheses_emptyString() {
        Assert.assertEquals("The result should be true for the empty string\n",
                true, ValidParentheses.isValidParentheses(""));
    }
}

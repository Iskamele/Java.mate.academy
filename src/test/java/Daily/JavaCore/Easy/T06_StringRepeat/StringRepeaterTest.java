package Daily.JavaCore.Easy.T06_StringRepeat;

import org.junit.Assert;
import org.junit.Test;
import section00_DailyTasks.JavaCore.Easy.T06_StringRepeat.StringRepeater;

public class StringRepeaterTest {
    @Test
    public void repeatString_oneTime() {
        String input = "Mate";
        int times = 1;
        String actual = StringRepeater.repeatString(times, input);
        Assert.assertEquals(String.format("Your method should return a string \"%s\" for input = \"%s\" and times = %d",
                "Mate", input, times), "Mate", actual);
    }

    @Test
    public void repeatString_twoTimes() {
        String input = "java";
        int times = 2;
        String actual = StringRepeater.repeatString(times, input);
        Assert.assertEquals(String.format("Your method should return a string \"%s\" for input = \"%s\" and times = %d",
                "javajava", input, times), "javajava", actual);
    }

    @Test
    public void repeatString_sixTimes() {
        String input = "1_1";
        int times = 6;
        String actual = StringRepeater.repeatString(times, input);
        Assert.assertEquals(String.format("Your method should return a string \"%s\" for input = \"%s\" and times = %d",
                "1_11_11_11_11_11_1", input, times), "1_11_11_11_11_11_1", actual);
    }

    @Test
    public void repeatString_zeroTimes() {
        String input = "REPEATER";
        int times = 0;
        String actual = StringRepeater.repeatString(times, input);
        Assert.assertEquals(String.format("Your method should return an empty string \"%s\" for input = \"%s\" and times = %d",
                "", input, times), "", actual);
    }

    @Test
    public void repeatString_emptyString() {
        String input = "";
        int times = 5;
        String actual = StringRepeater.repeatString(times, input);
        Assert.assertEquals(String.format("Your method should return an empty string \"%s\" for input = \"%s\" and times = %d",
                "", input, times), "", actual);
    }
}

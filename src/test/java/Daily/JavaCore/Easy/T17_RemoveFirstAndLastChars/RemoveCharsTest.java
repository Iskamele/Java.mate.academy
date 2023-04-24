package Daily.JavaCore.Easy.T17_RemoveFirstAndLastChars;

import section00_DailyTasks.JavaCore.Easy.T17_RemoveFirstAndLastChars.RemoveChars;
import org.junit.Assert;
import org.junit.Test;

public class RemoveCharsTest {
    @Test
    public void removeChars_stringOfFiveChars() {
        Assert.assertEquals("Method should remove the first and the last chars from the 5-char string\n",
                "bcd", RemoveChars.removeChars("abcde"));
    }

    @Test
    public void removeChars_stringOfTenChars() {
        Assert.assertEquals("Method should remove the first and the last chars from the 10-char string\n",
                "weRtYuiO", RemoveChars.removeChars("QweRtYuiOp"));
    }

    @Test
    public void removeChars_stringOfTwoChars() {
        Assert.assertEquals("Method should remove the first and the last chars from the 2-char string\n",
                "", RemoveChars.removeChars("jv"));
    }

    @Test
    public void removeChars_stringOfDigits() {
        Assert.assertEquals("Method should remove the first and the last chars from the string of digits\n",
                "052863042720", RemoveChars.removeChars("10528630427203"));
    }

    @Test
    public void removeChars_stringWithSpaces() {
        Assert.assertEquals("Method should remove the first and the last chars from the string with spaces\n",
                "trimMe!", RemoveChars.removeChars(" trimMe! "));
    }
}

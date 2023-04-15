package Daily.JavaCore.Easy.T11_StringConverter;

import java.util.Random;
import org.junit.Assert;
import org.junit.Test;
import section00_DailyTasks.JavaCore.Easy.T11_StringConverter.StringConverter;

public class StringConverterTest {
    @Test
    public void stringify_startWithOne() {
        Assert.assertEquals("Your string should start with 1",
                '1', StringConverter.stringify(3).charAt(0));
    }

    @Test
    public void stringify_evenSizeToString() {
        Assert.assertEquals("Your method should convert an even size to string",
                "101010", StringConverter.stringify(6));
    }

    @Test
    public void stringify_oddSizeToString() {
        Assert.assertEquals("Your method should convert an odd size to string",
                "10101", StringConverter.stringify(5));
    }

    @Test
    public void stringify_lengthEqualToSize() {
        Random random = new Random();
        int size = 1 + random.nextInt(50);
        int expected = StringConverter.stringify(size).length();
        Assert.assertEquals("Your method should return a string with the length specified in the size",
                expected, size);
    }
}

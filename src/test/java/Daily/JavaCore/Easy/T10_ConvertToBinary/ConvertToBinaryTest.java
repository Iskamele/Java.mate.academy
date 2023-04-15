package Daily.JavaCore.Easy.T10_ConvertToBinary;

import java.util.Random;
import org.junit.Assert;
import org.junit.Test;
import section00_DailyTasks.JavaCore.Easy.T10_ConvertToBinary.ConvertToBinary;

public class ConvertToBinaryTest {
    @Test
    public void toBinary_ConvertNumberOne() {
        Assert.assertEquals("Your method should return the converted number 1",
                1, ConvertToBinary.toBinary(1));
    }

    @Test
    public void toBinary_ConvertOneDigit() {
        Assert.assertEquals("Your method should return the converted digit",
                101, ConvertToBinary.toBinary(5));
    }

    @Test
    public void toBinary_ConvertTheNumber() {
        Assert.assertEquals("Your method should return the converted number",
                1011, ConvertToBinary.toBinary(11));
    }

    @Test
    public void toBinary_ConvertRandomNumber() {
        Random random = new Random();
        int randomNum = 1 + random.nextInt(29);
        String binaryString = Integer.toBinaryString(randomNum);
        int expected = Integer.parseInt(binaryString);
        int actual = ConvertToBinary.toBinary(randomNum);

        Assert.assertEquals("Your method should return the converted random number",
                expected, actual);
    }
}

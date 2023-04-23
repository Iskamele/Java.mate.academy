package Daily.JavaCore.Easy.T13_SimpleMultiplication;

import java.util.Random;
import org.junit.Assert;
import org.junit.Test;
import section00_DailyTasks.JavaCore.Easy.T13_SimpleMultiplication.SimpleMultiplication;

public class SimpleMultiplicationTest {
    @Test
    public void multiplyNumber_checkForEven() {
        Random random = new Random();
        int randomEvenNumber = random.nextInt(100 / 2) * 2;
        int expected = randomEvenNumber * 8;
        Assert.assertEquals(String.format("The result of multiplication by 8 should be %d for the even number %d\n",
                expected, randomEvenNumber), expected, SimpleMultiplication.multiplyNumber(randomEvenNumber));
    }

    @Test
    public void multiplyNumber_checkForOdd() {
        Random random = new Random();
        int randomOddNumber = 2 * random.nextInt(100 / 2) + 1;
        int expected = randomOddNumber * 9;
        Assert.assertEquals(String.format("The result of multiplication by 9 should be %d for the odd number %d\n",
                expected, randomOddNumber), expected, SimpleMultiplication.multiplyNumber(randomOddNumber));
    }
}

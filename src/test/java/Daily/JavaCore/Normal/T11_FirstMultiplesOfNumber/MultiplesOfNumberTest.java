package Daily.JavaCore.Normal.T11_FirstMultiplesOfNumber;

import section00_DailyTasks.JavaCore.Normal.T11_FirstMultiplesOfNumber.MultiplesOfNumber;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class MultiplesOfNumberTest {
    @Test
    public void getMultiples_firstMultiple() {
        int multiples = 1;
        int number = 314;
        int[] expected = new int[]{314};
        int[] actual = MultiplesOfNumber.getMultiples(multiples, number);
        Assert.assertArrayEquals(String.format("The result of the first multiple of the number 314 is an array \"%s\"\n",
                Arrays.toString(expected)), expected, actual);
    }

    @Test
    public void getMultiples_firstTwoMultiples() {
        int multiples = 2;
        int number = 10;
        int[] expected = new int[]{10, 20};
        int[] actual = MultiplesOfNumber.getMultiples(multiples, number);
        Assert.assertArrayEquals(String.format("The result of the first 2 multiples of the number 10 is an array \"%s\"\n",
                Arrays.toString(expected)), expected, actual);
    }

    @Test
    public void getMultiples_firstThreeMultiples() {
        int multiples = 3;
        int number = 5;
        int[] expected = new int[]{5, 10, 15};
        int[] actual = MultiplesOfNumber.getMultiples(multiples, number);
        Assert.assertArrayEquals(String.format("The result of the first 3 multiples of the number 5 is an array \"%s\"\n",
                Arrays.toString(expected)), expected, actual);
    }

    @Test
    public void getMultiples_firstMultiplesNegativeNumber() {
        int multiples = 5;
        int number = -1;
        int[] expected = new int[]{-1, -2, -3, -4, -5};
        int[] actual = MultiplesOfNumber.getMultiples(multiples, number);
        Assert.assertArrayEquals(String.format("The result of the first 5 multiples of the number -1 is an array \"%s\"\n",
                Arrays.toString(expected)), expected, actual);
    }

    @Test
    public void getMultiples_firstEightMultiples() {
        int multiples = 8;
        int number = 38;
        int[] expected = new int[]{38, 76, 114, 152, 190, 228, 266, 304};
        int[] actual = MultiplesOfNumber.getMultiples(multiples, number);
        Assert.assertArrayEquals(String.format("The result of the first 8 multiples of the number 38 is an array \"%s\"\n",
                Arrays.toString(expected)), expected, actual);
    }
}

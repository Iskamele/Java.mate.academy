package Daily.JavaCore.Easy.T12_SumOfSquares;

import org.junit.Assert;
import org.junit.Test;
import section00_DailyTasks.JavaCore.Easy.T12_SumOfSquares.SumOfSquare;

public class SumOfSquareTest {
    @Test
    public void getSquareSum_emptyArray() {
        Assert.assertEquals("Method should return zero for the empty array\n",
                0, SumOfSquare.getSquareSum(new int[]{}));
    }

    @Test
    public void getSquareSum_zerosInArray() {
        Assert.assertEquals("Method should return zero for an array of zeros\n",
                0, SumOfSquare.getSquareSum(new int[]{0, 0, 0, 0, 0}));
    }

    @Test
    public void getSquareSum_oneElementInArray() {
        Assert.assertEquals("Method should return the square of the number if it is the only one in the array\n",
                4, SumOfSquare.getSquareSum(new int[]{2}));
    }

    @Test
    public void getSquareSum_positiveElementsInArray() {
        Assert.assertEquals("Method should return the sum of the squares of all positive elements\n",
                30, SumOfSquare.getSquareSum(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void getSquareSum_negativeElementsInArray() {
        Assert.assertEquals("Method should return the sum of the squares of all negative elements\n",
                83, SumOfSquare.getSquareSum(new int[]{-3, -5, -7}));
    }

    @Test
    public void getSquareSum_multipleElementsInArray() {
        Assert.assertEquals("The method should return the sum of the squares of all the elements of the array\n",
                51, SumOfSquare.getSquareSum(new int[]{5, -3, 4, 0, -1}));
    }
}

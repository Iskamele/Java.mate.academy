package Daily.JavaCore.Easy.T18_TipCalculator;

import section00_DailyTasks.JavaCore.Easy.T18_TipCalculator.TipCalculator;
import org.junit.Assert;
import org.junit.Test;

public class TipCalculatorTest {
    @Test
    public void calculateTip_terribleService() {
        double amount = 10d;
        String rating = "terrible";
        int actual = TipCalculator.calculateTip(amount, rating);
        Assert.assertEquals(String.format("The amount of tips should be %d for the terrible service and total amount %f\n",
                0, amount), 0, actual);
    }

    @Test
    public void calculateTip_poorService() {
        double amount = 30d;
        String rating = "poor";
        int actual = TipCalculator.calculateTip(amount, rating);
        Assert.assertEquals(String.format("The amount of tips should be %d for the poor service and total amount %f\n",
                2, amount), 2, actual);
    }

    @Test
    public void calculateTip_goodService() {
        double amount = 45.87;
        String rating = "GOOD";
        int actual = TipCalculator.calculateTip(amount, rating);
        Assert.assertEquals(String.format("The amount of tips should be %d for the good service and total amount %f\n",
                5, amount), 5, actual);
    }

    @Test
    public void calculateTip_greatService() {
        double amount = 107.65;
        String rating = "GReat";
        int actual = TipCalculator.calculateTip(amount, rating);
        Assert.assertEquals(String.format("The amount of tips should be %d for the great service and total amount %f\n",
                17, amount), 17, actual);
    }

    @Test
    public void calculateTip_excellentService() {
        double amount = 20d;
        String rating = "Excellent";
        int actual = TipCalculator.calculateTip(amount, rating);
        Assert.assertEquals(String.format("The amount of tips should be %d for the excellent service and total amount %f\n",
                4, amount), 4, actual);
    }

    @Test
    public void calculateTip_unknownRating() {
        double amount = 99.99;
        String rating = "thank you so much";
        Integer actual = TipCalculator.calculateTip(amount, rating);
        Assert.assertEquals(String.format("Your method should return 'null' for the unknown rating \"%s\"\n",
                rating), null, actual);
    }
}

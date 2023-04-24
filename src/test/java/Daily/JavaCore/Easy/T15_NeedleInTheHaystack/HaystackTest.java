package Daily.JavaCore.Easy.T15_NeedleInTheHaystack;

import section00_DailyTasks.JavaCore.Easy.T15_NeedleInTheHaystack.Haystack;
import org.junit.Assert;
import org.junit.Test;

public class HaystackTest {
    @Test
    public void findNeedle_onlyOneNeedleInHaystack() {
        Object[] haystack = new Object[]{"needle"};
        String message = "found the needle at position 0";
        Assert.assertEquals(String.format("Result should be \"%s\" for the single needle in array\n",
                message), message, Haystack.findNeedle(haystack));
    }

    @Test
    public void findNeedle_twoObjectsInHaystack() {
        Object[] haystack = new Object[]{"banana", "needle"};
        String message = "found the needle at position 1";
        Assert.assertEquals(String.format("Result should be \"%s\" for the second object 'needle' in the array\n",
                message), message, Haystack.findNeedle(haystack));
    }

    @Test
    public void findNeedle_threeObjectsInHaystack() {
        Object[] haystack = new Object[]{"hay", "banana", "needle"};
        String message = "found the needle at position 2";
        Assert.assertEquals(String.format("Result should be \"%s\" for the third object 'needle' in the array\n",
                message), message, Haystack.findNeedle(haystack));
    }

    @Test
    public void findNeedle_nullInHaystack() {
        Object[] haystack = new Object[]{null, "hay", null, "needle"};
        String message = "found the needle at position 3";
        Assert.assertEquals(String.format("Result should be \"%s\" for the forth object 'needle' in the array\n",
                message), message, Haystack.findNeedle(haystack));
    }

    @Test
    public void findNeedle_booleanInHaystack() {
        Object[] haystack = new Object[]{false, true, "hay", false, "needle"};
        String message = "found the needle at position 4";
        Assert.assertEquals(String.format("Result should be \"%s\" for the fifth object 'needle' in the array\n",
                message), message, Haystack.findNeedle(haystack));
    }

    @Test
    public void findNeedle_numbersInHaystack() {
        Object[] haystack = new Object[]{1, 2, 3, 4, 5, 6, 7, 8, 9, "needle"};
        String message = "found the needle at position 9";
        Assert.assertEquals(String.format("Result should be \"%s\" for the ninth object 'needle' in the array\n",
                message), message, Haystack.findNeedle(haystack));
    }
}

package Daily.JavaCore.Easy.T03_SwapValues;

import org.junit.Assert;
import org.junit.Test;
import section00_DailyTasks.JavaCore.Easy.T03_SwapValues.Swap;

public class SwapTest {
    @Test
    public void Swap_integerArray() {
        Object[] args = new Object[]{1, 2};
        Swap ints = new Swap(args);
        ints.swapValues();
        Assert.assertEquals("Method should swap two integers in the array\n",
                2, ints.arguments[0]);
        Assert.assertEquals("Method should swap two integers in the array\n",
                1, ints.arguments[1]);
    }

    @Test
    public void Swap_charArray() {
        Object[] args = new Object[]{'a', 'b'};
        Swap chars = new Swap(args);
        chars.swapValues();
        Assert.assertEquals("Method should swap two chars in the array\n",
                'b', chars.arguments[0]);
        Assert.assertEquals("Method should swap two chars in the array\n",
                'a', chars.arguments[1]);
    }

    @Test
    public void Swap_booleanArray() {
        Object[] args = new Object[]{true, false};
        Swap booleans = new Swap(args);
        booleans.swapValues();
        Assert.assertEquals("Method should swap two booleans in the array\n",
                false, booleans.arguments[0]);
        Assert.assertEquals("Method should swap two booleans in the array\n",
                true, booleans.arguments[1]);
    }

    @Test
    public void Swap_stringArray() {
        Object[] args = new Object[]{"Hello", "world"};
        Swap strs = new Swap(args);
        strs.swapValues();
        Assert.assertEquals("Method should swap two strings in the array\n",
                "world", strs.arguments[0]);
        Assert.assertEquals("Method should swap two strings in the array\n",
                "Hello", strs.arguments[1]);
    }
}

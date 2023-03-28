package Daily.JavaCore.Normal.T08_BreakChocolateProblem;

import org.junit.Assert;
import org.junit.Test;
import section00_DailyTasks.JavaCore.Normal.T08_BreakChocolateProblem.ChocolateBar;

public class ChocolateBarTest {
    @Test
    public void breakChocolate_barSize1X1() {
        int n = 1;
        int m = 1;
        int actual = ChocolateBar.breakChocolate(n, m);
        Assert.assertEquals("The minimum number of breaks is 0 for a 1 x 1 chocolate bar\n",
                0, actual);
    }

    @Test
    public void breakChocolate_barSize5X5() {
        int n = 5;
        int m = 5;
        int actual = ChocolateBar.breakChocolate(n, m);
        Assert.assertEquals("The minimum number of breaks is 24 for a 5 x 5 chocolate bar\n",
                24, actual);
    }

    @Test
    public void breakChocolate_barSize7X4() {
        int n = 7;
        int m = 4;
        int actual = ChocolateBar.breakChocolate(n, m);
        Assert.assertEquals("The minimum number of breaks is 27 for a 7 x 4 chocolate bar\n",
                27, actual);
    }

    @Test
    public void breakChocolate_noBarToSplit() {
        int n = 0;
        int m = 0;
        int actual = ChocolateBar.breakChocolate(n, m);
        Assert.assertEquals("The result should be 0 if we do not have any chocolate to split\n",
                0, actual);
    }

    @Test
    public void breakChocolate_bazSize1X6() {
        int n = 1;
        int m = 6;
        int actual = ChocolateBar.breakChocolate(n, m);
        Assert.assertEquals("The minimum number of breaks is 5 for a 1 x 6 chocolate bar\n",
                5, actual);
    }
}

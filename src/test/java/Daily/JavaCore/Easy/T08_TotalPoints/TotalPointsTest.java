package Daily.JavaCore.Easy.T08_TotalPoints;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;
import section00_DailyTasks.JavaCore.Easy.T08_TotalPoints.TotalPoints;

public class TotalPointsTest {
    @Test
    public void countPoints_xLessThanY() {
        String[] results = new String[]{"0:1", "0:2", "0:3", "0:4", "1:2", "1:3", "1:4", "2:3", "2:4", "3:4"};
        Assert.assertEquals("Method should return zero points for the following football matches results: "
                + Arrays.toString(results) + "\n", 0, TotalPoints.countPoints(results));
    }

    @Test
    public void countPoints_xGreaterThanY() {
        String[] results = new String[]{"1:0", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3"};
        Assert.assertEquals("Method should return the total number of points for the following football matches results: "
                + Arrays.toString(results) + "\n", 30, TotalPoints.countPoints(results));
    }

    @Test
    public void countPoints_xEqualToY() {
        String[] results = new String[]{"1:1", "2:2", "3:3", "4:4", "2:2", "3:3", "4:4", "3:3", "4:4", "4:4"};
        Assert.assertEquals("Method should return the total number of points for the following football matches results: "
                + Arrays.toString(results) + "\n", 10, TotalPoints.countPoints(results));
    }

    @Test
    public void countPoints_multipleResults() {
        String[] results = new String[]{"1:0", "2:0", "3:0", "4:4", "2:2", "3:3", "1:4", "2:3", "2:4", "3:4"};
        Assert.assertEquals("Method should return the total number of points for the following football matches results: "
                + Arrays.toString(results) + "\n", 12, TotalPoints.countPoints(results));
    }
}

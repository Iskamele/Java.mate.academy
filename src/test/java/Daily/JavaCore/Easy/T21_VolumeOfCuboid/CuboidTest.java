package Daily.JavaCore.Easy.T21_VolumeOfCuboid;

import section00_DailyTasks.JavaCore.Easy.T21_VolumeOfCuboid.Cuboid;
import org.junit.Assert;
import org.junit.Test;

public class CuboidTest {
    private static final double DELTA = 0.0001;

    @Test
    public void getVolume_cuboidOne() {
        Assert.assertEquals("The volume should be 4 for the (1, 2, 2) cuboid\n",
                4, Cuboid.getVolume(1, 2, 2), DELTA);
    }

    @Test
    public void getVolume_cuboidTwo() {
        Assert.assertEquals("The volume should be 2000 for the (40, 5, 10) cuboid\n",
                2000, Cuboid.getVolume(40, 5, 10), DELTA);
    }

    @Test
    public void getVolume_cuboidThree() {
        Assert.assertEquals("The volume should be 310.59 for the (6.3, 3.0, 5.0) cuboid\n",
                94.5, Cuboid.getVolume(6.3, 3.0, 5.0), DELTA);
    }

    @Test
    public void getVolume_noCuboid() {
        Assert.assertEquals("The volume should be 0 for the (0, 0, 0) cuboid\n",
                0, Cuboid.getVolume(0, 0, 0), DELTA);
    }
}

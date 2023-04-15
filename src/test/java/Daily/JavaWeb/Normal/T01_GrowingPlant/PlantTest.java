package Daily.JavaWeb.Normal.T01_GrowingPlant;

import org.junit.Assert;
import org.junit.Test;
import section00_DailyTasks.JavaWeb.Normal.T01_GrowingPlant.Plant;

public class PlantTest {
    @Test
    public void growPlant_growthEqualToDesiredHeight() {
        Assert.assertEquals("Method should return 1 if growth during the day is equal to the desired height\n",
                1, Plant.growPlant(3, 3, 3));
    }

    @Test
    public void growPlant_growthGreaterDesiredHeight() {
        Assert.assertEquals("Method should return 1 if growth during the day is greater than the desired height\n",
                1, Plant.growPlant(6, 5, 5));
    }

    @Test
    public void growPlant_growthSmallerThanDesiredHeight() {
        Assert.assertEquals("Method should should return the number of days when it takes several days for a plant to grow\n",
                3, Plant.growPlant(2, 1, 4));
    }

    @Test
    public void growPlant_growthMuchSmallerThanDesiredHeight() {
        Assert.assertEquals("Method should should return the number of days when it takes many days for a plant to grow\n",
                38, Plant.growPlant(10, 7, 120));
    }
}

package Daily.JavaSpring.Easy.T01_AreaOrPerimeter;

import org.junit.Assert;
import org.junit.Test;
import section00_DailyTasks.JavaSpring.Easy.T01_AreaOrPerimeter.Polygon;

public class PolygonTest {
    @Test
    public void getAreaOrPerimeter_areaOfSquare() {
        int length = 1;
        int width = 1;
        int expected = 1;
        int actual = Polygon.getAreaOrPerimeter(length, width);
        Assert.assertEquals("The area should be 1 for the square with length = 1, width = 1\n",
                expected, actual);
    }

    @Test
    public void getAreaOrPerimeter_forSquare() {
        int length = 5;
        int width = 5;
        int expected = 25;
        int actual = Polygon.getAreaOrPerimeter(length, width);
        Assert.assertEquals("The area should be 25 for the square with length = 5, width = 5\n",
                expected, actual);
    }

    @Test
    public void getAreaOrPerimeter_perimeterOfRectangle() {
        int length = 8;
        int width = 12;
        int expected = 40;
        int actual = Polygon.getAreaOrPerimeter(length, width);
        Assert.assertEquals("The perimeter should be 40 for the rectangle with length = 8, width = 12\n",
                expected, actual);
    }

    @Test
    public void getAreaOrPerimeter_forRectangle() {
        int length = 10;
        int width = 4;
        int expected = 28;
        int actual = Polygon.getAreaOrPerimeter(length, width);
        Assert.assertEquals("The perimeter should be 28 for the rectangle with length = 10, width = 4\n",
                expected, actual);
    }
}

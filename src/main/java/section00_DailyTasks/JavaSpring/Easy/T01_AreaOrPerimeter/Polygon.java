package section00_DailyTasks.JavaSpring.Easy.T01_AreaOrPerimeter;

public class Polygon {
    public static int getAreaOrPerimeter(int length, int width) {
        return length == width ? length * width : length * 2 + width * 2;
    }
}

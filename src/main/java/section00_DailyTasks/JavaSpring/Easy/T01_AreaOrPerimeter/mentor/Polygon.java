package section00_DailyTasks.JavaSpring.Easy.T01_AreaOrPerimeter.mentor;

public class Polygon {
    public static int getAreaOrPerimeter(int length, int width) {
        return length == width ? length * width : 2 * (length + width);
    }
}

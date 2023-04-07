
package section00_DailyTasks.JavaWeb.Normal.T01_GrowingPlant;

public class Plant {
    public static int growPlant(int upSpeed, int downSpeed, int desiredHeight) {
        int days = 0;
        int currentHeight = 0;
        for (int i = 0; currentHeight < desiredHeight; i++) {
            if (i % 2 == 0) {
                currentHeight += upSpeed;
                days++;
            } else {
                currentHeight -= downSpeed;
            }
        }
        return days;
    }
}

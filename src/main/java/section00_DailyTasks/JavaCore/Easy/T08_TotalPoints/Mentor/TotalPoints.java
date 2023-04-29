package section00_DailyTasks.JavaCore.Easy.T08_TotalPoints.Mentor;

public class TotalPoints {
    public static int countPoints(String[] games) {
        int total = 0;
        for (String game : games) {
            if (game.charAt(0) > game.charAt(2)) {
                total += 3;
            } else if (game.charAt(0) == game.charAt(2)) {
                total += 1;
            }
        }
        return total;
    }
}

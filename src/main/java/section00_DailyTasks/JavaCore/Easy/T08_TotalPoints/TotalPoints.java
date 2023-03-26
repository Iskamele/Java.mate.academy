package section00_DailyTasks.JavaCore.Easy.T08_TotalPoints;

public class TotalPoints {
    public static int countPoints(String[] games) {
        int points = 0;
        for (String game : games) {
            int firstTeam = Integer.parseInt(game.split(":")[0]);
            int secondTeam = Integer.parseInt(game.split(":")[1]);
            if (firstTeam > secondTeam) {
                points += 3;
            }
            if (firstTeam == secondTeam) {
                points++;
            }
        }
        return points;
    }
}

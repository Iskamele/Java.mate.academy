package section00_DailyTasks.JavaCore.Normal.T02_RowWeights.mentor;

public class RowWeights {
    public static int[] getTotalWeight(int[] weights) {
        int firstTeam = 0;
        int secondTeam = 0;
        for (int i = 0; i < weights.length; i++) {
            if (i % 2 == 0) {
                firstTeam += weights[i];
            } else {
                secondTeam += weights[i];
            }
        }
        return new int[]{firstTeam, secondTeam};
    }
}

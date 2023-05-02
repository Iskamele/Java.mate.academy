package section00_DailyTasks.JavaCore.Easy.T25_CountSheep.Mentor;

public class CountSheep {
    public static String countSheep(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= number; i++) {
            stringBuilder.append(i).append(" sheep...");
        }
        return stringBuilder.toString();
    }
}

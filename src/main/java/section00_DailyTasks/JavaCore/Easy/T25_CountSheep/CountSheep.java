package section00_DailyTasks.JavaCore.Easy.T25_CountSheep;

public class CountSheep {
    public static String countSheep(int number) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= number; i++) {
            builder.append(i);
            builder.append(" sheep...");
        }
        return builder.toString();
    }
}

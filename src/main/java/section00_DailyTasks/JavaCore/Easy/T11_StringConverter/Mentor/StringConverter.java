package section00_DailyTasks.JavaCore.Easy.T11_StringConverter.Mentor;

public class StringConverter {
    public static String stringify(int size) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                builder.append(1);
            } else {
                builder.append(0);
            }
        }
        return builder.toString();
    }
}

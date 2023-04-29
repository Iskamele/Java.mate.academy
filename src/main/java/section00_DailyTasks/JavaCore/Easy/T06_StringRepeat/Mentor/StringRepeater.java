package section00_DailyTasks.JavaCore.Easy.T06_StringRepeat.Mentor;

public class StringRepeater {
    public static String repeatString(int times, String string) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < times; i++) {
            result.append(string);
        }
        return result.toString();
    }
}

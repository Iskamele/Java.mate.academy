package section00_DailyTasks.JavaCore.Easy.T17_RemoveFirstAndLastChars;

public class RemoveChars {
    public static String removeChars(String string) {
        return string.substring(1, string.length() - 1);
    }
}

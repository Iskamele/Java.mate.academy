package section00_DailyTasks.JavaCore.Easy.T16_RemoveAllDots;

public class Replacer {
    public static String replaceDots(final String str) {
        return str.replaceAll("\\.", "-");
    }
}

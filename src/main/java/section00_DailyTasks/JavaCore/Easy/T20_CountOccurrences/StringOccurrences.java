package section00_DailyTasks.JavaCore.Easy.T20_CountOccurrences;

public class StringOccurrences {
    public static int countOccurrences(String string, char letter) {
        return (int) string.chars()
                .filter(c -> c == letter)
                .count();
    }
}

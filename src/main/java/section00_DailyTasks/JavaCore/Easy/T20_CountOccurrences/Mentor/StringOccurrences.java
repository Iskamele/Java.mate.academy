package section00_DailyTasks.JavaCore.Easy.T20_CountOccurrences.Mentor;

public class StringOccurrences {
    public static int countOccurrences(String string, char letter) {
        int counter = 0;
        for (char character : string.toCharArray()) {
            if (letter == character) {
                counter++;
            }
        }
        return counter;
    }
}

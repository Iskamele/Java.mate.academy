package section00_DailyTasks.JavaCore.Easy.T15_NeedleInTheHaystack.Mentor;

public class Haystack {
    public static String findNeedle(Object[] haystack) {
        String result = "";
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] == "needle") {
                result = "found the needle at position " + i;
                break;
            }
        }
        return result;
    }
}

package section00_DailyTasks.JavaCore.Easy.T15_NeedleInTheHaystack;

import java.util.stream.IntStream;

public class Haystack {
    public static String findNeedle(Object[] haystack) {
        return IntStream.range(0, haystack.length)
                .filter(i -> "needle".equals(haystack[i]))
                .mapToObj(i -> "found the needle at position " + i)
                .findFirst()
                .orElseThrow();
    }
}

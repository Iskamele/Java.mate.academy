package section00_DailyTasks.JavaCore.Normal.T17_BreakCamelCase;

import java.util.stream.Collectors;

public class CamelCaseWithStream {
    public static String breakCamelCase(String input) {
        return input.chars()
                .mapToObj(c -> Character.isUpperCase((char) c) ? " " + (char) c : String.valueOf((char) c))
                .collect(Collectors.joining());
    }
}

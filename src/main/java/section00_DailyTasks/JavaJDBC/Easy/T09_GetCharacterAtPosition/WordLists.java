
package section00_DailyTasks.JavaJDBC.Easy.T09_GetCharacterAtPosition;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class WordLists {
    public static List<Character> getCharacterAtPosition(List<String> strings, int position) {
        return strings.stream()
                .filter(Objects::nonNull)
                .map(s -> s.toLowerCase().charAt(position))
                .sorted()
                .collect(Collectors.toList());
    }
}

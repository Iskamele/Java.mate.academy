package section00_DailyTasks.JavaCore.Easy.T11_StringConverter;

import java.util.Collections;

public class StringConverter {
    public static String stringify(int size) {
        if (size == 1) {
            return "1";
        }
        String repeats = String.join("", Collections.nCopies(size / 2 + size % 2, "10"));
        return (size % 2 != 0) ? repeats.substring(0, repeats.length() - 1) : repeats;
    }
}

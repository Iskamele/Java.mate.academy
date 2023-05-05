package section00_DailyTasks.JavaCore.Normal.T19_SortGiftCode;

import java.util.stream.Collectors;

public class GiftSorter {
    public static String sortGiftCode(String code) {
        return code.chars()
                .sorted()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
    }
}

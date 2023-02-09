package section04_JavaCore.topic20_StreamAPIPractice.practice.SortNames;

import java.util.List;
import java.util.stream.Collectors;

public class SortNames {
    private static final int OUTPUT_LIMIT = 3;

    public static List<String> sortNames(List<String> names) {
        return names.stream()
                .sorted()
                .limit(OUTPUT_LIMIT)
                .collect(Collectors.toList());
    }
}

package section04_JavaCore.topic20_StreamAPIPractice.practice.UniqueNumbers;

import java.util.List;
import java.util.stream.Collectors;

public class UniqueNumbers {
    public static List<Character> getUniqueNumbers(String sourceNumber) {
        return sourceNumber.chars()
                .mapToObj(c -> (char) c)
                .distinct()
                .collect(Collectors.toList());
    }
}

package section04_JavaCore.topic19_Java8Part2.practice.StreamApiPartTwo;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamApiMedium {
    private static final int AGE_INDEX = 0;
    private static final String PERSON_SEPARATOR = ":";

    /**
     * Given list strings representing records of patients' visits to a Hospital
     * {"John Stevenson:2020", "Andrew Ferguson:2012", "Andrew Ferguson:2013"}.
     * Return number of unique persons who have visited hospital during the given year (second input param).
     * Be careful, because one person may visit a hospital several times per year and for each visit new record
     * will be generated. Result shouldn't contain duplicates.
     */

    public Long getVisitorsPerYear(List<String> records, int year) {
        return records.stream()
                .filter(r -> r.contains(String.valueOf(year)))
                .distinct()
                .count();
    }

    /**
     * Given a map with the following view : "company name" - "monthly income delta"  (String/Integer)
     * Return list of the companies with positive delta. Their names should be sorted alphabetically
     * Example input : {"Sun.ltd" : 20_000}, {"Micro" : -5_200}, {"Clarity": 0}, {"Odyssey": 9_640};
     * Output : {"Odyssey", "Sun.ltd"}
     */

    public List<String> getCompanies(Map<String, Integer> input) {
        return input.entrySet()
                .stream()
                .filter(e -> e.getValue() > 0)
                .map(Map.Entry::getKey)
                .sorted()
                .collect(Collectors.toList());
    }

    /**
     * Given a list of integer numbers, convert each integer into its' binary representation in string format
     * and join all of them into a single string and putting each value into brackets, it should look like this:
     * Input: {1, 20, 33}
     * Output:
     * (1)
     * (10100)
     * (100001)
     */

    public String convertAndModifyNumbers(List<Integer> numbers) {
        return numbers.stream()
                .map(i -> '(' + Integer.toBinaryString(i) + ')')
                .collect(Collectors.joining(System.lineSeparator()));
    }

    /**
     * Given string value. Your task is
     * to increment char value of each symbol from the string. Amount to increment is
     * passed with the second input param - 'increment'
     */

    public String charsIncrementation(String string, int increment) {
        return string.chars()
                .map(c -> c + increment)
                .mapToObj(c -> (char) c)
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    /**
     * Given List of string where each element represents persons' age and name:
     * {"99:Johny", "20:Brad", ...} return the age of the oldest person
     */

    public Long getOldestPersonAge(List<String> people) {
        return people.stream()
                .map(p -> Long.valueOf(p.split(PERSON_SEPARATOR)[AGE_INDEX]))
                .max(Long::compareTo)
                .get();
    }
}

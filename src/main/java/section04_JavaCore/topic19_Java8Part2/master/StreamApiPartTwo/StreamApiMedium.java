package section04_JavaCore.topic19_Java8Part2.master.StreamApiPartTwo;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamApiMedium {
  /*
     constant for storing index of year
     in splitted records for 'getVisitorsPerYear()'
  */
  private static final int YEAR_INDEX = 1;
  /*
     constant for storing index of age
     in splitted peoples for 'getOldestPersonAge()'
  */
  private static final int AGE_INDEX = 0;

  public Long getVisitorsPerYear(List<String> records, int year) {
    return records.stream()
      // leave only records where year of record equals to passed one
      .filter(r -> Integer.parseInt(r.split(":")[YEAR_INDEX]) == year)
      // leave only unique visitors
      .distinct()
      // return number of visitors
      .count();
  }

  public List<String> getCompanies(Map<String, Integer> input) {
    // form stream from entrySet
    return input.entrySet()
      .stream()
      // leave only companies with positive income
      .filter(e -> e.getValue() > 0)
      // convert Map.Entry<String, Integer> -> String (company's name)
      .map(Map.Entry::getKey)
      // sort company's names alphabetically
      .sorted()
      /// return the result as List
      .collect(Collectors.toList());
  }

  public String convertAndModifyNumbers(List<Integer> numbers) {
    return numbers.stream()
      // convert numbers to binary string
      .map(Integer::toBinaryString)
      /*
        return the result in such form:
          (1)
          (10100)
          (100001)
      */
      .collect(Collectors.joining(")" + System.lineSeparator() + "(", "(", ")"));
  }

  public String charsIncrementation(String string, int increment) {
    // create stream of numbers that represents symbols according to ASCII
    return string.chars()
      // convert Integer incremented on 1 to Character
      .mapToObj(c -> (char) (c += increment))
      // convert Character to String
      .map(String::valueOf)
      // return stream of String as one whole String
      .collect(Collectors.joining());
  }

  public Long getOldestPersonAge(List<String> peoples) {
    return peoples.stream()
      // convert String -> Long (age of person)
      .map(p -> Long.valueOf(p.split(":")[AGE_INDEX]))
      // sort age ascending to find maximum age
      .max(Long::compareTo)
      // return maximum age
      .get();
  }
}

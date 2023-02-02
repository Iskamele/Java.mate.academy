package section04_JavaCore.topic19_Java8Part2.master.StreamApiPartThree;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamApiAdvanced {
  private static final int MIN_AGE = 18;

  public List<Integer> filterAndReverse(int[] inputNumbers) {
    return Arrays.stream(inputNumbers)
      // leave numbers that can be divided by 5 without a remainder
      .filter(n -> n % 5 == 0)
      // convert int -> Integer
      .boxed()
      // sort numbers in reverse order
      .sorted(Collections.reverseOrder())
      // return result as List
      .collect(Collectors.toList());
  }

  public Map<Integer, List<Person>> groupByAge(List<Person> people) {
    return people.stream()
      // leave only women with age greater or equal than 18 and with cats
      .filter(p -> p.getSex() == Person.Sex.WOMAN && p.getAge() >= MIN_AGE
        && !p.getCatList().isEmpty())
      // group women by their age
      .collect(Collectors.groupingBy(Person::getAge));
  }

  public Map<Character, List<String>> groupWordsByLastChar(List<String> words) {
    return words.stream()
      // leave only words where last character is a letter
      .filter(w -> Character.isAlphabetic(w.charAt(w.length() - 1)))
      // group words by their last character
      .collect(Collectors.groupingBy(w -> w.charAt(w.length() - 1)));
  }
}

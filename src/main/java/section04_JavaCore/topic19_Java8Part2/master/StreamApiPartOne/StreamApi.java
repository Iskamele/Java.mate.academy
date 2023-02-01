package section04_JavaCore.topic19_Java8Part2.master.StreamApiPartOne;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamApi {
  public Integer getOddNumsSum(List<Integer> numbers) {
    return numbers.stream()
      // leave only odd numbers
      .filter(n -> n % 2 != 0)
      // calculate and return sum of odd numbers
      .reduce(0, Integer::sum);
  }

  public Long calculateOccurrences(List<String> elements, String element) {
    return elements.stream()
      // leave only elements that equal to `element`
      .filter(e -> e.equals(element))
      // return the number of elements that left
      .count();
  }

  public Optional<String> getFirstElement(List<String> elements) {
    return elements.stream()
      // return an Optional of the first element in list
      .findFirst();
  }

  public List<Integer> getThreeSmallestNumbers(int[] numbers) {
    return Arrays.stream(numbers)
      // convert int -> Integer
      .boxed()
      // sort numbers in ascending order
      .sorted()
      // leave only first 3 elements of array
      .limit(3)
      // return result as List
      .collect(Collectors.toList());
  }

  public String findElement(List<String> elements, String element) {
    return elements.stream()
      // leave only elements that equal to `element`
      .filter(e -> e.equals(element))
      // take any element in list that equals to 'element' as Optional
      .findAny()
      // get value of element or in case if Optional is empty
      // throw NoSuchElementException
      .get();
  }
}

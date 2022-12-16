package section04_JavaCore.topic11_ArrayList.master.ElementsSum;

import java.util.List;

public class ListElementsAddition {
  public int calculateSum(List<Integer> numbers) {
    // if list of numbers is null return 0
    if (numbers == null) {
      return 0;
    }
    // variable for storing sum of all numbers
    int sum = 0;
    // iterate through every element in array
    for (int num : numbers) {
      // add number to sum total
      sum += num;
    }
    // return sum total
    return sum;
  }
}
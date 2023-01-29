package section04_JavaCore.topic19_Java8Part1.master.CompareEngineVolumes;

import java.util.function.BinaryOperator;

/*
  in this task we pass two parameters and return value of the same type,
  so for this case we choose BinaryOperator
*/
public class CompareEngineVolumes implements BinaryOperator<Integer> {
  @Override
  public Integer apply(Integer firstPower, Integer secondPower) {
    // return the difference between powers of engines
    return firstPower - secondPower;
  }
}

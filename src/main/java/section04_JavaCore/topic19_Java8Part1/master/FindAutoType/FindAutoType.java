package section04_JavaCore.topic19_Java8Part1.master.FindAutoType;

import java.util.function.Function;

/*
  in this task we pass parameter of one type and return value of other type,
  so for this case we choose Function
*/
public class FindAutoType implements Function<Integer, AutoType> {
  /*
    constant for storing value of weight,
    that will be used for defining type of the car
  */
  private static final Integer THRESHOLD_WEIGHT = 1500;

  @Override
  public AutoType apply(Integer weight) {
    // define the type of auto depending on its weight and return it
    return weight < THRESHOLD_WEIGHT ? AutoType.CAR : AutoType.TRUCK;
  }
}

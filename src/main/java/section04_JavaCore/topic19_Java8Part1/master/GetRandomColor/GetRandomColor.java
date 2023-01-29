package section04_JavaCore.topic19_Java8Part1.master.GetRandomColor;

import java.util.Random;
import java.util.function.Supplier;

/*
  in this task we need to return String value
  without passing parameters,
  so we choose Supplier for this case
*/
public class GetRandomColor implements Supplier<String> {
  private static final String[] COLORS = {"red", "green", "blue", "yellow", "pink",
    "black", "white"};

  @Override
  public String get() {
    // value for storing random index of color
    int index = new Random().nextInt(COLORS.length);
    // return element of array by index
    return COLORS[index];
  }
}
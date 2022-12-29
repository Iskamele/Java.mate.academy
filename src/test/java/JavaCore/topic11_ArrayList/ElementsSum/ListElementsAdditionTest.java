package JavaCore.topic11_ArrayList.ElementsSum;

import org.junit.Assert;
import org.junit.Test;
import section04_JavaCore.topic11_ArrayList.practice.ElementsSum.ListElementsAddition;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

public class ListElementsAdditionTest {
  private static final List<Integer> NULL_INPUT = null;
  private static final List<Integer> EMPTY_INPUT = Collections.emptyList();
  private static final List<Integer> NEGATIVE_ONLY_INPUT
                  = List.of(-1, -34, -2, -55, -26, -41, -35, -100);
  private static final List<Integer> POSITIVE_ONLY_INPUT
                  = List.of(2, 77, 45, 32, 89, 100, 56, 42, 88, 95);
  private static final List<Integer> MIXED_INPUT
                  = List.of(5, -1, 43, -100, 57, 87, -32, 90, -67, -56);
  private final ListElementsAddition listElementsAddition = new ListElementsAddition();

  @Test
  public void calculateSum_methodIsCalled_OK() {
    Method method = null;
    try {
      method = ListElementsAddition.class.getMethod("calculateSum", List.class);
    } catch (NoSuchMethodException e) {
      Assert.assertEquals("Your method should be called 'calculateSum'.\n",
        true, method != null);
    }
  }

  @Test
  public void calculateSum_methodReturnType_OK() {
    Method method = null;
    try {
      method = ListElementsAddition.class.getMethod("calculateSum", List.class);
      if (!method.getReturnType().isPrimitive()) {
        Assert.assertEquals("Your method should return a primitive.\n", true, false);
      }
    } catch (NoSuchMethodException e) {
      Assert.assertEquals("Your method should be called 'calculateSum' and expect " +
          "a List as a parameter.\n", true, method != null);
    }
  }

  @Test
  public void calculateSum_nullInput() {
    int actual = listElementsAddition.calculateSum(NULL_INPUT);
    Assert.assertEquals(String.format("Result should be %s for input %s.\n", 0, NULL_INPUT),
      0, actual);
  }

  @Test
  public void calculateSum_emptyInput() {
    int actual = listElementsAddition.calculateSum(EMPTY_INPUT);
    Assert.assertEquals(String.format("Result should be %s for input %s.\n", 0, EMPTY_INPUT),
      0, actual);
  }

  @Test
  public void calculateSum_positiveOnlyInput() {
    int actual = listElementsAddition.calculateSum(POSITIVE_ONLY_INPUT);
    Assert.assertEquals(String.format("Result should be %s for input %s.\n",
      626, POSITIVE_ONLY_INPUT), 626, actual);
  }

  @Test
  public void calculateSum_negativeOnlyInput() {
    int actual = listElementsAddition.calculateSum(NEGATIVE_ONLY_INPUT);
    Assert.assertEquals(String.format("Result should be %s for input %s.\n", -294, NEGATIVE_ONLY_INPUT),
      -294, actual);
  }

  @Test
  public void calculateSum_mixedInput() {
    int actual = listElementsAddition.calculateSum(MIXED_INPUT);
    Assert.assertEquals(String.format("Result should be %s for input %s.\n", 26, MIXED_INPUT),
      26, actual);
  }
}

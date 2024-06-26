package section04_JavaCore.topic17_SetQueueStackAndComparator.master.FindSymmetricDifferenceOfTwoSets;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference<T> {
  public Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
    // variable for storing elements of 'set1'
    Set<T> firstSet = new HashSet<>(set1);
    // variable for storing elements of 'set2'
    Set<T> secondSet = new HashSet<>(set2);

    // remove elements that the 'set2' contains from the firstSet
    firstSet.removeAll(set2);
    // remove elements that the 'set1' contains from the secondSet
    secondSet.removeAll(set1);
    // combine all elements of symmetric difference in one 'Set' variable
    firstSet.addAll(secondSet);
    // return elements of symmetric difference
    return firstSet;
  }
}

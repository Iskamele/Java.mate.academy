package section04_JavaCore.topic17_SetQueueStackAndComparator.practice.FindSymmetricDifferenceOfTwoSets;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference<T> {
  public Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
    Set<T> symmetric = new HashSet<>(set1);
    symmetric.retainAll(set2);
    Set<T> difference = new HashSet<>(set1);
    difference.addAll(set2);
    difference.removeAll(symmetric);
    return difference;
  }
}

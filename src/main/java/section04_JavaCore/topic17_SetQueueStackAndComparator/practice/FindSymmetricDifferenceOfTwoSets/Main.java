package section04_JavaCore.topic17_SetQueueStackAndComparator.practice.FindSymmetricDifferenceOfTwoSets;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        SymmetricDifference<Integer> symmetricDifference = new SymmetricDifference<Integer>();

        Set<Integer> set1 = new HashSet<>();
        set1.add(0);
        set1.add(1);
        set1.add(2);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);

        System.out.println(symmetricDifference.symmetricDifference(set1, set2));
    }
}

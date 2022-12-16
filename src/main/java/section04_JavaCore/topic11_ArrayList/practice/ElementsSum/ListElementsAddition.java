package section04_JavaCore.topic11_ArrayList.practice.ElementsSum;

import java.util.List;

public class ListElementsAddition {
    public int calculateSum(List<Integer> list){
        if (list == null) {
            return 0;
        }
        return list.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
}

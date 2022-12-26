package section04_JavaCore.topic12_LinkedList.theory.T01_LinkedListStructure;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(10);
        list.add(30);
        list.add(1, 15);
        list.remove(2);

        System.out.println(list);
    }
}

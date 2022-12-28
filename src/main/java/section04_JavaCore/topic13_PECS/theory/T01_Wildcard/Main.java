package section04_JavaCore.topic13_PECS.theory.T01_Wildcard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Wildcard ?
        List<String> strings = List.of("Hello", "World", "Generics");
        List<Integer> integers = List.of(10, 20, 30);
        List<Integer> objects = new ArrayList<>();

        //printCollection(strings);
        //printCollection(integers);
        //printCollection(objects);

        // Problem with parametrized types
        List<Cat> cats = new ArrayList<>();
        printCollection(cats);
    }

//    private static void printCollection(Collection<?> collection) {
//        for (Object element : collection) {
//            System.out.println(element);
//        }
//    }

    private static void printCollection(Collection<? extends Animal> collection) {
        for (Object element : collection) {
            System.out.println(element);
        }
    }
}

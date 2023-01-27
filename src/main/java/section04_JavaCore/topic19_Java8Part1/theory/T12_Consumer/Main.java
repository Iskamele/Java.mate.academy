package section04_JavaCore.topic19_Java8Part1.theory.T12_Consumer;

import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        // Function interfaces in JDK example

        // Consumer
        Consumer<String> sout = System.out::println;

        List<String> names = List.of("Bob", "Alice", "John");
        names.forEach(sout);
    }
}

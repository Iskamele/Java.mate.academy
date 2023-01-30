package section04_JavaCore.topic19_Java8Part2.theory.T03_HowToCreateStream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        // Java 8: How to create Stream

        // 1. using .stream() method from Collection
        List<String> names = List.of("Bob", "Alice", "John");
        names.stream().forEach(System.out::println);

        // 2. Stream.of()
        Stream.of("Bob", "Alice", "John").forEach(System.out::println);

        // 3. Arrays.stream([])
        String[] cities = new String[]{"Kyiv", "London", "Paris"};
        Arrays.stream(cities).forEach(System.out::println);

        // 4. chars()
        String value = "Hello";
        IntStream chars = value.chars();

        // 5. generate
        Stream.generate(new Random()::nextInt).limit(5).forEach(System.out::println);

        // 6. iterate()
        Stream.iterate(0, i -> i + 2).limit(5).forEach(System.out::println);

        // 7. range()
        IntStream.range(4, 10).forEach(System.out::println);
    }
}

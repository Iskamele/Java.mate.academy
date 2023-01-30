package section04_JavaCore.topic19_Java8Part2.theory.T08_BoxedAnMapToObj;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        // Stream API: boxed + mapToOIbj
        List<String> cities = List.of("Kyiv", "London", "Paris", "Oslo");

        // Select all unique characters
        Set<Character> uniqueCharacters = cities.stream()
                .map(String::chars)
                .flatMap(IntStream::boxed)
                .mapToInt(i -> i)
                .mapToObj(i -> (char) i)
                .collect(Collectors.toSet());

        System.out.println(uniqueCharacters);

        // Stream<String>
        Set<String> streamString = cities.stream()
                .map(String::chars)
                .flatMap(IntStream::boxed)
                .mapToInt(i -> i)
                .mapToObj(i -> "" + i)
                .collect(Collectors.toSet());
        System.out.println(streamString);
    }
}

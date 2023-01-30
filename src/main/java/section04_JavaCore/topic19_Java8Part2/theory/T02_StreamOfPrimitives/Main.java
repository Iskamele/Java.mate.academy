package section04_JavaCore.topic19_Java8Part2.theory.T02_StreamOfPrimitives;

import java.util.List;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {

    private static java.util.function.LongToIntFunction LongToIntFunction;

    public static void main(String[] args) {
        // Java 8: Stream of primitives
        List<String> names = List.of("Alice", "Bob", "John");
        Stream<String> namesStream = names.stream();

        // IntSteam
        IntStream intStream = namesStream.mapToInt(String::length);
        OptionalInt maxInt = intStream.max();
        OptionalInt minInt = intStream.min();
        int sumInt = intStream.sum();

        Stream<String> stringStream = intStream.mapToObj(String::valueOf);

        // LongSteam
        LongStream longStream = namesStream.mapToLong(String::length);
        OptionalLong maxLong = longStream.max();
        OptionalLong minLong = longStream.min();
        long sumLong = longStream.sum();
        IntStream longToIntStream = longStream.mapToInt(LongToIntFunction);

        // DoubleStream
        DoubleStream doubleStream = namesStream.mapToDouble(String::length);
        OptionalLong maxDouble = longStream.max();
        OptionalLong minDouble = longStream.min();
        long sumDouble = longStream.sum();
    }
}

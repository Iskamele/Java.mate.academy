package section04_JavaCore.topic19_Java8Part1.theory.T13_Supplier;

import java.util.Random;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        // Function interfaces in JDK example

        // Supplier
        Supplier<Integer> randomGenerator = () -> new Random().nextInt();
        System.out.println(randomGenerator.get());
    }
}

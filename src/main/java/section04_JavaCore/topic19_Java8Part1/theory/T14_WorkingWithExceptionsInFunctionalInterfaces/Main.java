package section04_JavaCore.topic19_Java8Part1.theory.T14_WorkingWithExceptionsInFunctionalInterfaces;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // Functional interfaces in JDK example
        // Exceptions

        Function<String, String> stringStringFunction = new Function<String, String>() {
            @Override
            public String apply(String s) {
                if (s == null) {
                    throw new RuntimeException();
                }
                return s.toUpperCase();
            }
        };
    }
}

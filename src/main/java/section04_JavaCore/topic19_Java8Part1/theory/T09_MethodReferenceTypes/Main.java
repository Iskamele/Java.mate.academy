package section04_JavaCore.topic19_Java8Part1.theory.T09_MethodReferenceTypes;

import section04_JavaCore.topic19_Java8Part1.theory.T09_MethodReferenceTypes.model.User;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Java 8: Method reference
        // There are four kinds of method references:
        // - Static methods
        // - Instance methods of particular objects
        // - Instance methods of an arbitrary object of a particular type
        // - Constructor


        // Static methods
        NumbersService<Integer> integerNumbersService = Integer::parseInt;
        Integer integer = integerNumbersService.getFromString("123");
        System.out.println(integer);

        // Instance methods of particular objects
        // Реализация в ComparisonMain

        // Instance methods of an arbitrary object of a particular type
        String[] names = {"Barbara", "James", "Mary", "John",
                "Patricia", "Robert", "Michael", "Linda"};
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));

        // Constructor
        UserService userService = User::new;
        User bob = userService.of("Bob");
        System.out.println(bob);
    }
}

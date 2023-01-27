package section04_JavaCore.topic19_Java8Part1.theory.T10_FunctionalInterfacesInJDKFunction;

import section04_JavaCore.topic19_Java8Part1.theory.T10_FunctionalInterfacesInJDKFunction.function.StudentsGradeFunction;
import section04_JavaCore.topic19_Java8Part1.theory.T10_FunctionalInterfacesInJDKFunction.function.User;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        // Function interfaces in JDK example

        /*
            - Function
            - Predicate
            - Consumer
            - Supplier
            - ...
         */

        // Function
        StudentsGradeFunction studentsGradeFunction = new StudentsGradeFunction();
        String result = studentsGradeFunction.apply(98);
        System.out.println(result);

        User bob = new User(22, "Bob");
        Function<User, String> userStringFunction = User::getName;
    }
}

package section04_JavaCore.topic19_Java8Part1.theory.T15_PrivateAndStaticMethods;

import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        //Private methods
        Test test = () -> {

        };
        test.print();
        System.out.println(Test.get());
        // excample
        Comparator.reverseOrder();
    }
}

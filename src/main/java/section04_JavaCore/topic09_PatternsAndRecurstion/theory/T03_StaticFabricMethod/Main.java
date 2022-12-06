package section04_JavaCore.topic09_PatternsAndRecurstion.theory.T03_StaticFabricMethod;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        User bob = User.of("Bob", 22);
        User alice = User.of("Alice", 19);

        System.out.println(bob);
        System.out.println(alice);

        // examples
        Integer value = Integer.valueOf("123");
        String strValue = String.valueOf(123);
        List<Integer> numbers = List.of(1, 2, 3, 4);
        System.out.println(numbers);
    }
}

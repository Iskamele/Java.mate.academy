package section04_JavaCore.topic19_Java8Part1.theory.T06_DefaultMethods;

public class Main {

    public static void main(String[] args) {
        // Java 8: Default methods

        String[] names = new String[]{"Bob", "Alice"};
        Iterable<String> strings = new ArrayList<>(names);
        strings.printAll();
    }
}

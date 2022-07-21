package section01_JavaBasics.topic09_Arrays;

public class IndexOutOfBoundExceptionExplanation {
    public static void main(String[] args) {
        String[] names = {"Bob", "Alice", "John"};

        for (String name : names) {
            System.out.println("Name " + name);
        }

        System.out.println();

        names[0] = "Jane";
        for (String name : names) {
            System.out.println("Name " + name);
        }
    }
}

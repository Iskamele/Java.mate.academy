package section04_JavaCore.topic19_Java8Part1.theory.T04_LambdaTypes;

public class Main {

    public static void main(String[] args) {
        // Java 8: Lambda
        NoElement noElement = () -> System.out.println("Hello");

        // Это не best practice
        SingleElement singleElement = s -> {
            if (s == null) {
                System.out.println("NULL value!");
            }
            System.out.println(s);
        };

        TwoElements twoElements = (a, b) -> a - b;
    }
}

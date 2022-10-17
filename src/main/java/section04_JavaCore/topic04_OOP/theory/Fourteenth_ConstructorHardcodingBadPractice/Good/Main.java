package section04_JavaCore.topic04_OOP.theory.Fourteenth_ConstructorHardcodingBadPractice.Good;

public class Main {

    public static void main(String[] args) {
        User bob = new User(22, "Bob");
        System.out.println(bob);

        User alice = new User(23, "Alice");
        System.out.println(alice);
    }
}

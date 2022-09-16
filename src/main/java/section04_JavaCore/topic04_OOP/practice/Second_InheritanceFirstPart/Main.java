package section04_JavaCore.topic04_OOP.practice.Second_InheritanceFirstPart;

public class Main {
    public static void main(String[] args) {
        // Inheritance
        Employee bob = new Employee(100);
        bob.setName("Bob");
        bob.setAge(23);

        Student alice = new Student();
        alice.setAge(22);
        alice.setName("Alice");
        alice.setFavoriteSubject("Math");

        System.out.println(bob.getPersonalInfo());
        System.out.println(alice.getPersonalInfo());
    }
}

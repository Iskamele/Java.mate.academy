package section04_JavaCore.topic04_OOP.theory.T03_InheritanceSecondPart;

public class Main {
    public static void main(String[] args) {
        // Inheritance
        Employee bob = new Employee(100);
        bob.setName("Bob");
        bob.setAge(23);

        Person alice = new Student();
        alice.setAge(22);
        alice.setName("Alice");
        alice = new Employee((150));
        //alice.setFavoriteSubject("Math");

        System.out.println(bob.getPersonalInfo());
        System.out.println(alice.getPersonalInfo());
    }
}

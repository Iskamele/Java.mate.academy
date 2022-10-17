package section04_JavaCore.topic04_OOP.theory.Fifth_MethodOverloadingVsOverwriting;

public class Main {
    public static void main(String[] args) {
        // Inheritance
        Employee bob = new Employee(100);
        bob.setName("Bob");
        bob.setAge(23);

        double salary = bob.getSalary();
        double bobSalary = bob.getSalary(1.2);

        Student alice = new Student();
        alice.setAge(22);
        alice.setName("Alice");
        alice.setFavoriteSubject("Math");

        System.out.println(bob.getPersonalInfo());
        System.out.println(alice.getPersonalInfo());
        System.out.println(bob.getName());
    }
}

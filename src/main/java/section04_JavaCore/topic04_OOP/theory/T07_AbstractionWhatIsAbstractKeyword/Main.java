package section04_JavaCore.topic04_OOP.theory.T07_AbstractionWhatIsAbstractKeyword;

public class Main {
    public static void main(String[] args) {
        // Inheritance
        Person bob = new Employee(100);
        bob.setName("Bob");
        bob.setAge(23);

        Person alice = new Student();
        alice.setAge(22);
        alice.setName("Alice");

        Person john = new SuperStudent();
        john.setName("John");

        System.out.println(bob.sayHello());
        System.out.println(alice.sayHello());
        System.out.println(john.sayHello());
    }
}

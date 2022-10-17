package section04_JavaCore.topic04_OOP.theory.Sixth_Polymorphism;

public class Main {
    public static void main(String[] args) {
        // Inheritance
        Person bob = new Employee(100);
        bob.setName("Bob");
        bob.setAge(23);

        Person alice = new Student();
        alice.setAge(22);
        alice.setName("Alice");
        alice = new Employee(1000);

        Person john = new Person();
        john.setAge(25);
        john.setName("John");

        Person[] persons = new Person[]{bob, alice, john};
        for (Person person : persons) {
            printInfo(person);
        }
    }

    private static void printInfo(Person person) {
        System.out.println(person.getPersonalInfo());
    }
}

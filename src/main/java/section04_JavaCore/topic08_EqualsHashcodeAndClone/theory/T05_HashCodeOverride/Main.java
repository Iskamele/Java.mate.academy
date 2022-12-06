package section04_JavaCore.topic08_EqualsHashcodeAndClone.theory.T05_HashCodeOverride;

import section04_JavaCore.topic08_EqualsHashcodeAndClone.theory.T05_HashCodeOverride.model.User;

public class Main {
    public static void main(String[] args) {
        // equals
        User bob = new User("Bob", 23, "12345");
        User bob2 = new User("Bob", 23, "12345");
        User alice = new User("Alice", 22, "2222");

        // 1. If two objects are equal, they must have the same hashCode
        // 2. If two objects have the same hashCode, they may or may noy be equal
        // 3. If two objects have different hashCode, they must be not equal
        // 4. The same object should return the same hashCode until any of the properties are modified

        // First case
        System.out.println("First case");
        System.out.println(bob.equals(bob2));
        System.out.println(bob.hashCode());
        System.out.println(bob2.hashCode());
        System.out.println();

        // Second case

        // Third case
        System.out.println("Third case");
        System.out.println(alice.equals(bob2));
        System.out.println(alice.hashCode());
        System.out.println(bob2.hashCode());
    }
}

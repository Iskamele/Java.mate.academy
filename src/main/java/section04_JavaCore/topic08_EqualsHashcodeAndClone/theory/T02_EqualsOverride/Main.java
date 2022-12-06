package section04_JavaCore.topic08_EqualsHashcodeAndClone.theory.T02_EqualsOverride;

import section04_JavaCore.topic08_EqualsHashcodeAndClone.theory.T02_EqualsOverride.model.User;

public class Main {
    public static void main(String[] args) {
        // equals and hashcode

        User bob = new User("Bob", 23, "12345");
        User bob2 = new User("Bob", 23, "12345");

        System.out.println(bob.equals(bob2));
    }
}

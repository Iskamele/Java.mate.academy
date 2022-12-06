package section04_JavaCore.topic08_EqualsHashcodeAndClone.theory.T04_HashCodeIntro;

import section04_JavaCore.topic08_EqualsHashcodeAndClone.theory.T04_HashCodeIntro.model.SuperUser;
import section04_JavaCore.topic08_EqualsHashcodeAndClone.theory.T04_HashCodeIntro.model.User;

public class Main {
    public static void main(String[] args) {
        // equals
        User bob = new User("Bob", 23, "12345");
        User bob2 = new SuperUser("Bob", 23, "12345");
        System.out.println(bob.equals(bob2));

        // hashcode
        int hashCode = bob.hashCode();
        System.out.println(hashCode);

        // 2 ^ 32

        // if the amount of users is greater than 2 ^ 32,
        // so we will have at least two different objects 'a' and 'b' (a is not equals to b)
        // that will have the same HashCode

        // collision
    }
}

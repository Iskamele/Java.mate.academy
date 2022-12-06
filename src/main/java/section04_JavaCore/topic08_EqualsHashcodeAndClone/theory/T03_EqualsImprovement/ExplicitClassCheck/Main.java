package section04_JavaCore.topic08_EqualsHashcodeAndClone.theory.T03_EqualsImprovement.ExplicitClassCheck;

import section04_JavaCore.topic08_EqualsHashcodeAndClone.theory.T03_EqualsImprovement.ExplicitClassCheck.model.SuperUser;
import section04_JavaCore.topic08_EqualsHashcodeAndClone.theory.T03_EqualsImprovement.ExplicitClassCheck.model.User;

public class Main {
    public static void main(String[] args) {
        // equals and hashcode

        User bob = new User("Bob", 23, "12345");
        User bob2 = new SuperUser("Bob", 23, "12345");

        System.out.println(bob.equals(bob2));
    }
}

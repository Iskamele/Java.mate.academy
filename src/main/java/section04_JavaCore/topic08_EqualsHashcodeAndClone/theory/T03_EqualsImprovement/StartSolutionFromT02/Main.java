package section04_JavaCore.topic08_EqualsHashcodeAndClone.theory.T03_EqualsImprovement.StartSolutionFromT02;

import section04_JavaCore.topic08_EqualsHashcodeAndClone.theory.T03_EqualsImprovement.StartSolutionFromT02.model.SuperUser;
import section04_JavaCore.topic08_EqualsHashcodeAndClone.theory.T03_EqualsImprovement.StartSolutionFromT02.model.User;

public class Main {
    public static void main(String[] args) {
        // equals and hashcode

        User bob = new User("Bob", 23, "12345");
        User bob2 = new SuperUser("Bob", 23, "12345");

        System.out.println(bob.equals(bob2));
    }
}

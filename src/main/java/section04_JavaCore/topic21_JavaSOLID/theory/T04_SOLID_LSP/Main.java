package section04_JavaCore.topic21_JavaSOLID.theory.T04_SOLID_LSP;

import section04_JavaCore.topic21_JavaSOLID.theory.T04_SOLID_LSP.model.Bird;
import section04_JavaCore.topic21_JavaSOLID.theory.T04_SOLID_LSP.model.FlyingBird;
import section04_JavaCore.topic21_JavaSOLID.theory.T04_SOLID_LSP.model.Ostrich;
import section04_JavaCore.topic21_JavaSOLID.theory.T04_SOLID_LSP.model.Parrot;

public class Main {

    public static void main(String[] args) {
        // SOLID: LSP - Liskov Substitution Principle

        // Subtypes must be substitutable for their base types.

        FlyingBird parrot = new Parrot();
        FlyingBird[] birds = new FlyingBird[]{parrot};
        for (FlyingBird bird : birds) {
            bird.fly();
            bird.dance();
        }

        System.out.println();

        Ostrich ostrich = new Ostrich();
        Bird[] dancingBirds = new Bird[]{parrot, ostrich};
        for (Bird bird : dancingBirds) {
            bird.dance();
        }
    }
}

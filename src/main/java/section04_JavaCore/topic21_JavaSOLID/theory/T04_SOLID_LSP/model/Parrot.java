package section04_JavaCore.topic21_JavaSOLID.theory.T04_SOLID_LSP.model;

public class Parrot implements FlyingBird {
    @Override
    public void dance() {
        System.out.println("Parrot is dancing");
    }

    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }
}

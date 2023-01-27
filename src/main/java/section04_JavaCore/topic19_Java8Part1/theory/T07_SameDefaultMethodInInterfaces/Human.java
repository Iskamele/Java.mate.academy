package section04_JavaCore.topic19_Java8Part1.theory.T07_SameDefaultMethodInInterfaces;

public class Human implements Eatable, Walkable {
    @Override
    public void acceptFood(String food) {
        System.out.println("Fooooood" + food);
    }

    @Override
    public void printInfo() {
        Eatable.super.printInfo();
    }

    @Override
    public void goWalking() {
    }
}

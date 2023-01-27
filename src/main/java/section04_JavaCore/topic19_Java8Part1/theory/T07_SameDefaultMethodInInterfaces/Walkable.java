package section04_JavaCore.topic19_Java8Part1.theory.T07_SameDefaultMethodInInterfaces;

public interface Walkable {
    void goWalking();

    default void printInfo() {
        System.out.println("This is walkable message ...");
    }
}

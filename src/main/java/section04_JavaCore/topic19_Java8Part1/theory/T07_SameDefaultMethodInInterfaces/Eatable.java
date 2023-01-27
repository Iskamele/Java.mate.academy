package section04_JavaCore.topic19_Java8Part1.theory.T07_SameDefaultMethodInInterfaces;

public interface Eatable {
    void acceptFood(String food);

    default void printInfo() {
        System.out.println("This is eatable message ...");
    }
}

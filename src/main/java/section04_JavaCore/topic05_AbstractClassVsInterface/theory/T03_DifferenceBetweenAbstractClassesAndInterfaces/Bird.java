package section04_JavaCore.topic05_AbstractClassVsInterface.theory.T03_DifferenceBetweenAbstractClassesAndInterfaces;

public class Bird extends Animal implements Flyable, Walkable {
    public Bird() {
        super(name);
    }
    // 1. Extends one class, implement several interfaces
    // 2. Class has variables, Interface has constants only
    // 3. Abstract class has constructor, Interface doesn't have
    // 4. Abstract class use for state, Interface for behavior
}

package section04_JavaCore.topic10_Generics.theory.T02_Inheritance.Inheritance.model;

public class Horse extends Animal implements Cloneable {
    String name;

    public Horse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

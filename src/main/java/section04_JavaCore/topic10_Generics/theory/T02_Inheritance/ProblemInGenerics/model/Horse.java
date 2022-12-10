package section04_JavaCore.topic10_Generics.theory.T02_Inheritance.ProblemInGenerics.model;

public class Horse extends Animal {
    String name;

    public Horse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

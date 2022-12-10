package section04_JavaCore.topic10_Generics.theory.T02_Inheritance.ProblemInGenerics;

public class Aviary<T> {
    private T animal;

    public Aviary(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}

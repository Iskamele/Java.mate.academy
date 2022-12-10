package section04_JavaCore.topic10_Generics.theory.T02_Inheritance.Inheritance;

import section04_JavaCore.topic10_Generics.theory.T02_Inheritance.Inheritance.model.Animal;

public class Aviary<T extends Animal & Cloneable> {
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

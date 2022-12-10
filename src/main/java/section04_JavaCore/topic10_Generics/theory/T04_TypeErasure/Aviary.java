package section04_JavaCore.topic10_Generics.theory.T04_TypeErasure;

import section04_JavaCore.topic10_Generics.theory.T04_TypeErasure.model.Animal;

public class Aviary<T extends Animal> {
    private T[] animals;

    public Aviary(T[] animals) {
        this.animals = animals;
    }

    public boolean containsElement(T element) {
        for (T e : animals) {
            if (e.equals(element)) {
                return true;
            }
        }
        return false;
    }
}

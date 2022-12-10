package section04_JavaCore.topic10_Generics.theory.T03_InheritancePractice;

import section04_JavaCore.topic10_Generics.theory.T03_InheritancePractice.model.Animal;

public class Aviary<T extends Animal> {
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

    public void feed(String food) {
        animal.acceptFood(food);
    }
}

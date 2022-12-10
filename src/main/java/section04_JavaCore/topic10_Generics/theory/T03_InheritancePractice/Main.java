package section04_JavaCore.topic10_Generics.theory.T03_InheritancePractice;

import section04_JavaCore.topic10_Generics.theory.T03_InheritancePractice.model.Cat;
import section04_JavaCore.topic10_Generics.theory.T03_InheritancePractice.model.Horse;

public class Main {
    public static void main(String[] args) {
        // Inheritance in Generics

        Cat cat = new Cat("Jack");
        Horse horse = new Horse("Pony");

        Aviary<Cat> catsAviary = new Aviary<>(cat);
        Aviary<Horse> horseAviary = new Aviary<>(horse);

        catsAviary.feed("Meat");
    }
}

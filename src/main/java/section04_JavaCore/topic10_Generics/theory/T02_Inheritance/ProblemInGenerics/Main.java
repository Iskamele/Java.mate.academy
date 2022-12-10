package section04_JavaCore.topic10_Generics.theory.T02_Inheritance.ProblemInGenerics;

import section04_JavaCore.topic10_Generics.theory.T02_Inheritance.ProblemInGenerics.model.Cat;
import section04_JavaCore.topic10_Generics.theory.T02_Inheritance.ProblemInGenerics.model.Horse;

public class Main {
    public static void main(String[] args) {
        // Inheritance in Generics

        Cat cat = new Cat();
        Horse horse = new Horse("Pony");

        Aviary<Cat> catsAviary = new Aviary<>(cat);
        Aviary<Horse> horseAviary = new Aviary<>(horse);

        Cat catFromAviary = catsAviary.getAnimal();

        // Problem
        String message = "Hello world";
        Aviary<String> dogAviary = new Aviary<>(message);
    }
}

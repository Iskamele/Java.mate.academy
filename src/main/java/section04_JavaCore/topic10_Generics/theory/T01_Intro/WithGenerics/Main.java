package section04_JavaCore.topic10_Generics.theory.T01_Intro.WithGenerics;

import section04_JavaCore.topic10_Generics.theory.T01_Intro.WithGenerics.model.Horse;

public class Main {
    public static void main(String[] args) {
        // Generics
        // A generic type os a generic class or interface that is parameterized over types.
        // They were designed to extend JAva's type system to allow
        // "a type or method to operate on objects of various types while providing compile-time safety

        String mail = "Hello, mates!";
        Box boxMail = new Box(mail);

        Horse horse = new Horse("Pony");
        Box horseBox = new Box(horse);

        Object horseValue = horseBox.getValue();

        // without generics
        Horse horseValue2 = (Horse) horseBox.getValue();
        System.out.println(horseValue2.getName());

        // with generics
        Box<Horse> newHorseBox = new Box<>(horse);
        Horse value = newHorseBox.getValue();

        Box<String> newMailBox = new Box<>(mail);
        String value1 = newMailBox.getValue();
    }
}

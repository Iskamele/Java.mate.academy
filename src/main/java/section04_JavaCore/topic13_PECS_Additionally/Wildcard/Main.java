package section04_JavaCore.topic13_PECS_Additionally.Wildcard;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Animal(1));
        listOfAnimals.add(new Animal(2));

        List<Dog> listOfDogs = new ArrayList<>();
        listOfAnimals.add(new Dog(1));
        listOfAnimals.add(new Dog(2));

        test(listOfAnimals);
        test(listOfDogs);

        /*
            ? extends Animal
        Object
        +Animal
        +Dog

            ? super Animal
        +Object
        +Animal
        Dog
        */
    }

    private static void test(List<? extends Animal> list){
        for (Animal animal : list) {
            animal.eat();
        }
    }
}

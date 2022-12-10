package section04_JavaCore.topic10_Generics.theory.T04_TypeErasure;

import section04_JavaCore.topic10_Generics.theory.T04_TypeErasure.model.Cat;

public class Main {
    public static void main(String[] args) {
        // Type erasure

        Cat catty = new Cat("catty");
        Cat kote = new Cat("kote");
        Cat[] cats = new Cat[]{catty, kote};
        Aviary<Cat> catsAviary = new Aviary<>(cats);
        catsAviary.containsElement(kote);
    }
}

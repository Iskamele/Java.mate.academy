package section04_JavaCore.topic16_Immutable.theory.T02_MutableObjectsAndHashMap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // HashMap and mutable objects example

        // CASE 1, всё будет работать корректно
        {
            Map<User, List<String>> usersFavouriteSubjects = new HashMap<>();
            User bob = new User("Bob", "Alison", 22);
            usersFavouriteSubjects.put(bob, List.of("Math", "Chemistry"));

            System.out.println(usersFavouriteSubjects.get(bob));
        }

        System.out.println();

        // CASE 2, новый hash User не даст найти его в экземпляр в HashMap
        {
            Map<User, List<String>> usersFavouriteSubjects = new HashMap<>();
            User bob = new User("Bob", "Alison", 22);
            usersFavouriteSubjects.put(bob, List.of("Math", "Chemistry"));

            System.out.println(usersFavouriteSubjects.get(bob));
            bob.setAdress(new Address("Shevchenka",26));
            System.out.println(usersFavouriteSubjects.get(bob));
        }

        System.out.println();

        // CASE 3
        {
            Map<User, List<String>> usersFavouriteSubjects = new HashMap<>();
            User bob = new User("Bob", "Alison", 22);
            usersFavouriteSubjects.put(bob, List.of("Math", "Chemistry"));

            System.out.println(usersFavouriteSubjects.get(bob));
            bob.setAdress(new Address("Shevchenka",26));
            System.out.println(usersFavouriteSubjects.get(bob));
        }
    }
}

package section04_JavaCore.topic16_Immutable.theory.T03_HowToWriteImmutableClass.After.CloneForHomeWork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // How to create Immutable class

        /*
          1. Final class - no inheritance allowed
          2. No setter, only constructor for initialization
          3. return deep Copy of collection
          4. return deep Clone of any custom (not immutable) objects
          5. clone the object and collection in the constructor
         */
        {
            Map<User, List<String>> usersFavouriteSubjects = new HashMap<>();
            List<Language> languages = new ArrayList<>();
            languages.add(new Language("English"));
            languages.add(new Language("Ukrainian"));

            Address address = new Address("Shevchenka", 26);
            User bob = new User("Bob", "Alison", 23, address, languages);
            usersFavouriteSubjects.put(bob, List.of("Math", "Chemistry"));
            System.out.println(usersFavouriteSubjects.get(bob));

            bob.getAddress().setHouseNumber(99);
            System.out.println(usersFavouriteSubjects.get(bob));

            bob.getLanguages().add(new Language("Italian"));
            bob.getLanguages().get(0).setValue("Dutch");
            System.out.println(usersFavouriteSubjects.get(bob));
        }
        System.out.println();
        {
            Map<User, List<String>> usersFavouriteSubjects = new HashMap<>();
            List<Language> languages = new ArrayList<>();
            languages.add(new Language("English"));
            languages.add(new Language("Ukrainian"));

            Address address = new Address("Shevchenka", 26);
            User bob = new User("Bob", "Alison", 23, address, languages);
            usersFavouriteSubjects.put(bob, List.of("Math", "Chemistry"));

            System.out.println(usersFavouriteSubjects.get(bob));
            languages.add(new Language("Spanish"));
            System.out.println(usersFavouriteSubjects.get(bob));
        }
    }
}

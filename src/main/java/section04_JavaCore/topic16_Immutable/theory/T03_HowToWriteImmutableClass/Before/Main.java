package section04_JavaCore.topic16_Immutable.theory.T03_HowToWriteImmutableClass.Before;

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

        Map<User, List<String>> usersFavouriteSubjects = new HashMap<>();
        List<String> languages = new ArrayList<>();
        languages.add("English");
        languages.add("Ukrainian");

        Address address = new Address("Shevchenka", 26);
        User bob = new User("Bob", "Alison", 23);
        bob.setAddress(address);
        bob.setLanguages(languages);
                usersFavouriteSubjects.put(bob, List.of("Math", "Chemistry"));

        System.out.println(usersFavouriteSubjects.get(bob));
    }
}

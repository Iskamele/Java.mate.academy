package section04_JavaCore.topic16_Immutable.theory.T04_WhyDoWeNeedToMakeImmutableClassFinal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // How to create Immutable class

        /*
          1. Final class - no inheritance allowed
          2. No setter, only constructor for initialization
          3. create Builder class
          4. return Copy of collection
          5. return Clone of any custom class
          6. clone the object and collection in the constructor
         */

        Map<User, List<String>> usersFavouriteSubjects = new HashMap<>();
        List<String> subjects = List.of("Math", "Chemistry");

        /*
        У immutable-класса не может быть наследников, следуя этим правилам
        1. Final class - no inheritance allowed
        2. No setter, only constructor for initialization

        SupeUser superUser = new SuperUser();
        superUser.setSuperProperty("Hello world");
        usersFavouriteSubjects.put(superUser, subjects);
        System.out.println(usersFavouriteSubjects.get(superUser));
        superUser.setSuperProperty("null");
        System.out.println(usersFavouriteSubjects.get(superUser));
         */
    }
}

package section04_JavaCore.topic14_HashMap.theory.T06_HashMapPerformance;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // HashMap performance
        // Collision and performance
        // Best and worst case

        User bob = new User("Bob", "Alison", 10);
        User alice = new User("Alice", "Jackson", 26);
        User john = new User("John", "Johnson", 42);
        User bill = new User("Bill", "Swanson", 58);

        // User and count of friends
        Map<User, List<String>> usersFavoriteSubjects = new HashMap<>();
        usersFavoriteSubjects.put(bob, List.of("Math", "Chemistry"));;
        usersFavoriteSubjects.put(alice, List.of("Physics", "Math"));;
        usersFavoriteSubjects.put(john, List.of("Biology", "Chemistry"));;
        usersFavoriteSubjects.put(bill, List.of("Art", "Music"));;

        // Get value by key
        System.out.println(usersFavoriteSubjects.get(bob));
        System.out.println(usersFavoriteSubjects.get(alice));
        System.out.println(usersFavoriteSubjects.get(john));
        System.out.println(usersFavoriteSubjects.get(bill));
    }
}

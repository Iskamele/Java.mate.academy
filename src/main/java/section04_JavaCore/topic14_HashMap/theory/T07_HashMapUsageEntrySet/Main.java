package section04_JavaCore.topic14_HashMap.theory.T07_HashMapUsageEntrySet;

import java.util.*;

public class Main {

    private static Map<User, List<String>> usersFavoriteSubjects = new HashMap<>();


    public static void main(String[] args) {
        // Map

        User bob = new User("Bob", "Alison", 10);
        User alice = new User("Alice", "Jackson", 26);
        User john = new User("John", "Johnson", 42);
        User bill = new User("Bill", "Swanson", 58);

        // User and count of friends
        usersFavoriteSubjects.put(bob, List.of("Math", "Chemistry"));;
        usersFavoriteSubjects.put(alice, List.of("Physics", "Math"));;
        usersFavoriteSubjects.put(john, List.of("Biology", "Chemistry"));;
        usersFavoriteSubjects.put(bill, List.of("Art", "Music"));;

        System.out.println(getFavoriteSubjects("Bob"));
        System.out.println(getUsersBySubject("Math"));

        for (Map.Entry<User, List<String>> entry : usersFavoriteSubjects.entrySet()) {
            System.out.println("User " + entry.getKey().getName() + " subjects " + entry.getValue());
        }
    }

    private static List<String> getFavoriteSubjects(String username) {

        for (Map.Entry<User, List<String>> entry : usersFavoriteSubjects.entrySet()) {
            if (entry.getKey().getName().equals(username)) {
                return entry.getValue();
            }
        }
        return Collections.emptyList();
    }

    private static List<User> getUsersBySubject(String subject) {
        List<User> users = new ArrayList<>();

        for (Map.Entry<User, List<String>> entry : usersFavoriteSubjects.entrySet()) {
            if (entry.getValue().contains(subject)) {
                users.add(entry.getKey());
            }
        }
        return users;
    }
}

package section04_JavaCore.topic19_Java8Part1.theory.T11_Predicate;

import section04_JavaCore.topic19_Java8Part1.theory.T11_Predicate.function.User;
import section04_JavaCore.topic19_Java8Part1.theory.T11_Predicate.function.UserPredicate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Function interfaces in JDK example

        // Predicate
        List<User> users = new ArrayList<>();
        users.add(new User("Bob", 22));
        users.add(new User("Bill", 17));
        users.add(new User("Bruce", 18));
        users.add(new User("Alice", 22));
        UserPredicate userPredicate = new UserPredicate();
        for (User user : users) {
            if (userPredicate.test(user)) {
                System.out.println(user.getName());
            }
        }
    }
}

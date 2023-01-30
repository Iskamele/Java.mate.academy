package section04_JavaCore.topic19_Java8Part2.theory.T01_StreamAPIIntro;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        // Java 8: Stream API
        List<User> users = new ArrayList<>();
        users.add(new User("Bob"));
        users.add(new User("Alice"));
        users.add(new User("John"));
        users.add(new User("Bruce"));

        Predicate<User> userPredicate = user -> user.getName().startsWith("B");
        for (User user : users) {
            if (userPredicate.test(user)) {
                System.out.println(user.getName());
            }
        }
        users.stream()
                .filter(user -> user.getName().startsWith("B"))
                .forEach(user -> System.out.println(user.getName()));
    }
}

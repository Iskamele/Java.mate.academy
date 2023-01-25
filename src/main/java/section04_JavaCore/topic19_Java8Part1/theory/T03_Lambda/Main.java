package section04_JavaCore.topic19_Java8Part1.theory.T03_Lambda;

import section04_JavaCore.topic19_Java8Part1.theory.T01_InnerClasses.User;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        // Lambda example

        Comparator<User> userComparator = new Comparator<section04_JavaCore.topic19_Java8Part1.theory.T01_InnerClasses.User>() {
            @Override
            public int compare(User user1, User user2) {
                return user1.getAge() - user2.getAge();
            }
        };

        Set<User> users = new TreeSet<>(userComparator);
        users.add(new User("Bob", 23));
        users.add(new User("Alice", 22));
        users.add(new User("John", 27));
        users.add(new User("Bob", 27));
        users.add(new User("Bob", 19));
        System.out.println(users);


        // (parameters) -> sout(parameters);

        Comparator<User> userComparator2 = (user1, user2) -> user1.getAge() - user2.getAge();

        Set<User> users2 = new TreeSet<>(userComparator2);
        users2.add(new User("Bob", 23));
        users2.add(new User("Alice", 22));
        users2.add(new User("John", 27));
        users2.add(new User("Bob", 27));
        users2.add(new User("Bob", 19));
        System.out.println(users2);
    }
}

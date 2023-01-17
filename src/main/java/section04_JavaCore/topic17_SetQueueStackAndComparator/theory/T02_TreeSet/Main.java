package section04_JavaCore.topic17_SetQueueStackAndComparator.theory.T02_TreeSet;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        // Comparator vs Comparable

        Comparator<User> userComparator = new Comparator<User>() {
            @Override
            public int compare(User user1, User user2) {
                int namesCompared = user1.getName().compareTo(user2.getName());
                if (namesCompared!=0){
                    return namesCompared;
                }
                return Integer.compare(user1.getAge(), user2.getAge());
            }
        };

        Set<User> users = new TreeSet<>(userComparator.reversed());
        users.add(new User("Bob", 23));
        users.add(new User("Alice", 22));
        users.add(new User("John", 27));
        users.add(new User("Bob", 27));
        users.add(new User("Bob", 19));
        System.out.println(users);
    }
}

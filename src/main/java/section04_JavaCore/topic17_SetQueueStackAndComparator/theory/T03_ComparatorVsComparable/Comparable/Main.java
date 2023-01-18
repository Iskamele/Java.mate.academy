package section04_JavaCore.topic17_SetQueueStackAndComparator.theory.T03_ComparatorVsComparable.Comparable;

import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        // Comparable

        Set<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(-10);
        numbers.add(-50);
        numbers.add(0);
        numbers.add(99);
        numbers.add(7);

        System.out.println(numbers);

        Set<User> users = new TreeSet<>();
        users.add(new User("Bob", 23));
        users.add(new User("Alice", 22));
        users.add(new User("John", 27));
        users.add(new User("Bob", 27));
        users.add(new User("Bob", 19));
        System.out.println(users);
    }
}

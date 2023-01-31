package section04_JavaCore.topic19_Java8Part2.theory.T11_StreamAPIPerformance;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        //Stream API: performance

        List<User> users = Storage.getUsers();

        long before = System.currentTimeMillis();
        users.stream()
                .parallel()
                .filter(user -> user.getAge() > 20)
                .filter(user -> user.getHeight() > 100)
                .collect(Collectors.toList());
        long after = System.currentTimeMillis();
        System.out.println(after - before);

        List<User> filteredUsers = new ArrayList<>();
        long beforeOptimized = System.currentTimeMillis();
        for (User user : users) {
            if (user.getAge() > 20 && user.getHeight() > 100 && user.hasCat()) {
                filteredUsers.add(user);
            }
        }
        long afterOptimized = System.currentTimeMillis();
        System.out.println(afterOptimized - beforeOptimized);

    }
}

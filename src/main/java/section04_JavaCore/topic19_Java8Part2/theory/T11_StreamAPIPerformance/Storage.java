package section04_JavaCore.topic19_Java8Part2.theory.T11_StreamAPIPerformance;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Storage {
    private static final Random randomizer = new Random();

    public static List<User> getUsers() {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 50_000_000; i++) {
            int height = getRandomInt(200);
            int age = getRandomInt(40);
            boolean hasCat = getRandomInt(10) > 5;
            User user = new User(height, age, hasCat);
            users.add(user);
        }
        return users;
    }

    private static int getRandomInt(int bound) {
        return randomizer.nextInt(bound);
    }
}

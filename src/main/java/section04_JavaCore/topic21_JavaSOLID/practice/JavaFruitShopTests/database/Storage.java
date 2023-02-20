package section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShopTests.database;

import java.util.HashMap;
import java.util.Map;

public class Storage {
    private static final Map<String, Integer> fruitStorage = new HashMap<>();

    public static Map<String, Integer> getFruitStorage() {
        return fruitStorage;
    }
}

package section04_JavaCore.topic14_HashMap.practice.MarketSupplying;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MarketSupplying marketSupplying = new MarketSupplying();

        Map<String, Integer> storage = new HashMap<>();
        storage.put("Apple", 10);
        storage.put("Orange", 20);

        System.out.println(marketSupplying.supplyFruits(storage, 10));
    }
}

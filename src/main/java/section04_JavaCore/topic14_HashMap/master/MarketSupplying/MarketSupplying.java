package section04_JavaCore.topic14_HashMap.master.MarketSupplying;

import java.util.Map;

public class MarketSupplying {
    public Map<String, Integer> supplyFruits(Map<String, Integer> storage, int supply) {
        // iterate through every element in map
        for (Map.Entry<String, Integer> fruit : storage.entrySet()) {
            // update good's stock
            fruit.setValue(fruit.getValue() + supply);
        }
        // return updated storage
        return storage;
    }
}

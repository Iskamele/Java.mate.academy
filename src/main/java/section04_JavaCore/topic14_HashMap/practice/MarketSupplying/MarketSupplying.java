package section04_JavaCore.topic14_HashMap.practice.MarketSupplying;

import java.util.Map;
import java.util.HashMap;

public class MarketSupplying {
  public Map<String, Integer> supplyFruits(Map<String, Integer> storage, int supply) {
    Map<String, Integer> newStorage = new HashMap<>();
    for (Map.Entry<String, Integer> entry : storage.entrySet()) {
      newStorage.put(entry.getKey(), entry.getValue() + supply);
    }
    return newStorage;
  }
}

package section04_JavaCore.topic14_HashMap.theory.T02_HashMapStructure;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // HashMap internal structure
        // 16 ячеек - деолтный размер HashMap
        Map<Integer, Integer> points = new HashMap<>();
        points.put(10,123); // Под капотом 10 % 16 = 10 ячейка
        points.put(20,234); // 20 % 16 = 4 ячейка
        points.get(20); // 20 % 16 = 4 ... return table[4]
        points.put(null, 345); // null - 0 ячейка

        // Ячейки в HashMap называются bucket
    }
}

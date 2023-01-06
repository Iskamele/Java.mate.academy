package section04_JavaCore.topic14_HashMap.theory.T04_HashMapResize;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // HashMap resize: capacity, load factor, threshold
        // resize happens on put() method call
        Map<Integer, String> flats = new HashMap<>();

        // Number of flat and person who leave there
        flats.put(14, "John");    // 17 % 16 = 1
        flats.put(8, "Bob");      // 8 % 16 = 8
        flats.put(35, "Alice");   // 35 % 16 = 3
        flats.put(43, "Tanya");   // 43 % 16 = 11
        flats.put(56, "Bohdan");  // 56 % 16 = 8
        flats.put(62, "Artem");   // 62 % 16 = 14
        flats.put(77, "Roman");   // 77 % 16 = 13
        flats.put(89, "Anna");    // 89 % 16 = 9
        flats.put(91, "Sofia");   // 91 % 16 = 11
        flats.put(105, "Kate");   // 105 % 16 = 9
        flats.put(119, "Dime");   // 119 % 16 = 7
        flats.put(121, "Ksenia"); // 121 % 16 = 9
        flats.put(137, "Oleg");   // 137 % 16 = 9
    }
}

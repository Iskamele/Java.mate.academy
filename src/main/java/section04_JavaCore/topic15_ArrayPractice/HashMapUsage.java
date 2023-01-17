package section04_JavaCore.topic15_ArrayPractice;

import java.util.HashMap;
import java.util.Map;

public class HashMapUsage {
    public static void main(String[] args) {
        Map<String, Integer> data = new HashMap<>();
        data.put("myhelloworld", 4);
        data.put("Hello", 7);
        data.put("AwesomeString", 8);
        data.put("Wow!!!! HELLO", 9);

        String keyPart = "hello";

        System.out.println(calculateSum(data, keyPart));
    }

    public static int calculateSum(Map<String, Integer> data, String keyPart) {
        int sum = 0;
        if (data == null) {
            return sum;
        }
        if (keyPart == null) {
            for (int i : data.values()) {
                sum += i;
            }
            return sum;
        }
        for (Map.Entry<String, Integer> entry : data.entrySet()) {
            if (entry.getKey().toLowerCase().contains(keyPart.toLowerCase())) {
                sum += entry.getValue();
            }
        }
        return sum;
    }
}
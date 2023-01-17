package section04_JavaCore.topic16_Immutable.theory.T02_MutableObjectsAndHashMap;

import java.util.HashMap;
import java.util.Map;

public class ImmutableMapExample {
    public static void main(String[] args) {
        Map<String, String> countriesCapitals = new HashMap<>();
        String ukraine = "Ukraine";
        countriesCapitals.put(ukraine, "Kyiv");
        System.out.println(countriesCapitals.get(ukraine));
        ukraine.toUpperCase();
        System.out.println(countriesCapitals.get(ukraine));
    }
}

package section00_DailyTasks.JavaWeb.Hard.T01_PrimeString;

import java.util.ArrayList;
import java.util.List;

public class PrimeString {
    public static boolean isPrime(String string) {
        if (string.isEmpty() || string.length() == 1) {
            return true;
        }
        List<Character> list = new ArrayList<>();
        for (char c : string.toCharArray()) {
            list.add(c);
            String s = list.toString().replaceAll("\\W", "");
            String s1 = string.replaceAll(s, "");
            if (s1.length() == 0) {
                return false;
            }
            if (list.size() > string.length() / 2) {
                break;
            }
        }
        return true;
    }
}

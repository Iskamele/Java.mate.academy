package section04_JavaCore.topic19_Java8Part2.theory.T09_FindFirstFindAnyAndAnyMatch;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Stream API: find first
        System.out.println(getFirst('O'));
        System.out.println(isMatch('K'));
    }

    private static String getFirst(char letter) {
        List<String> cities = List.of("Kyiv", "Kyoto", "Oslo", "Antananarivo", "Vinnitsa");
        return cities.stream()
                .filter(s -> s.charAt(0) == letter)
                .findFirst()
                //.stream().findAny()
                .orElseThrow(() -> new RuntimeException("Can't find the city!"));
    }

    private static boolean isMatch (char letter){
        List<String> cities = List.of("Kyiv", "Kyoto", "Oslo", "Antananarivo", "Vinnitsa");
        return cities.stream()
                .anyMatch(s -> s.charAt(0) == letter);
    }
}

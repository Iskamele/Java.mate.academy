package section04_JavaCore.topic15_ArrayPractice;

public class CountOccurrences {
    public static void main(String[] args) {
        System.out.println(countOccurrences("azyxxzyzy", "zy"));
    }

    public static int countOccurrences(String str, String substr) {
        return str.split(substr, -1).length - 1;
    }
}

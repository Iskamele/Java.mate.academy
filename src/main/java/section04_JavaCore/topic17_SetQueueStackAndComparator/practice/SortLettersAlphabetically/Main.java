package section04_JavaCore.topic17_SetQueueStackAndComparator.practice.SortLettersAlphabetically;

public class Main {
    public static void main(String[] args) {
        SortLetters sortLetters = new SortLetters();
        String firstString = "ur-BvT?^ ra w;p";
        String secondString = "A _f*c a?F10";

        System.out.println(sortLetters.getUniqueCharacters(firstString));
        System.out.println(sortLetters.getUniqueCharacters(secondString));
    }
}

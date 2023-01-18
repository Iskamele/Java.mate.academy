package section04_JavaCore.topic17_SetQueueStackAndComparator.practice.SortLettersAlphabetically;

import java.util.Set;
import java.util.TreeSet;

public class SortLetters {
    static final int STRING_MAXIMUM_LENGTH = 5;

    public String getUniqueCharacters(String text) {
        Set<Character> set = new TreeSet<>();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                set.add(text.toLowerCase().charAt(i));
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Character c : set) {
            stringBuilder.append(c);
        }
        return stringBuilder.length() < STRING_MAXIMUM_LENGTH
                ? stringBuilder.toString() : stringBuilder.substring(0, 5);
    }
}

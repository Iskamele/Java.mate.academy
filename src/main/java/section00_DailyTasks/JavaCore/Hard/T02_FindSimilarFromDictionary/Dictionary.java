package section00_DailyTasks.JavaCore.Hard.T02_FindSimilarFromDictionary;

import java.util.HashSet;
import java.util.Set;

public class Dictionary {
    private final String[] words;

    public Dictionary(String[] words) {
        this.words = words;
    }

    public String findMostSimilar(String term) {
        Set<Character> set = new HashSet<>();
        for (char c : term.toCharArray()) {
            set.add(c);
        }
        int count = 0;
        int tempCount;
        String returnWord = "";
        for (String word : words) {
            Set<Character> wordSet = new HashSet<>();
            for (char c : word.toCharArray()) {
                wordSet.add(c);
            }
            Set<Character> retain = new HashSet<>(set);
            retain.retainAll(wordSet);
            tempCount = retain.size();
            if (word.length() > term.length()) {
                tempCount = tempCount - (word.length() - term.length());
            }
            if (count < tempCount) {
                returnWord = word;
                count = tempCount;
            }
        }
        return (count == 0) ? term : returnWord;
    }
}

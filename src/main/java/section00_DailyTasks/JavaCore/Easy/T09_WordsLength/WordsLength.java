package section00_DailyTasks.JavaCore.Easy.T09_WordsLength;

import java.util.Arrays;

public class WordsLength {
  public static int getWordsLength(String[] words) {
    return Arrays.stream(words)
            .filter(word -> word.contains("a") && !word.contains("z"))
            .mapToInt(String::length)
            .sum();
  }
}

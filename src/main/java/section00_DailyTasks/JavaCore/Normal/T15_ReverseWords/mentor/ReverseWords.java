package section00_DailyTasks.JavaCore.Normal.T15_ReverseWords.mentor;

public class ReverseWords {
    public static String reverseWords(final String string) {
        String[] words = string.split(" ");
        if (words.length == 0) {
            return string;
        }
        int i = 0;
        for (String word : words) {
            words[i] = new StringBuilder(word).reverse().toString();
            i++;
        }
        return String.join(" ", words);
    }
}


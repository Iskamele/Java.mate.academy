package section00_DailyTasks.JavaCore.Normal.T09_ConvertToCamelCase;

public class CamelCase {
    public static String convertToCamelCase(String string) {
        if (string.isEmpty()) {
            return "";
        }
        String clearedString = string.replaceAll("[^a-zA-Z]", " ");
        String[] words = clearedString.split(" ");
        StringBuilder builder = new StringBuilder(words[0]);
        for (int i = 1; i < words.length; i++) {
            builder.append(words[i].toUpperCase().charAt(0));
            builder.append(words[i].toLowerCase().substring(1, words[i].length()));
        }
        return builder.toString();
    }
}

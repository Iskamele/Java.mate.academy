package section00_DailyTasks.JavaHibernate.Hard.T01_SimplePigLatin;

public class SimplePigLatin {
    public static String toSimplePigLatin(String string) {
        if (string.isEmpty()) {
            return string;
        }
        StringBuilder builder = new StringBuilder();
        String[] wordsAndPunctuation = string.split(" ");
        for (String word : wordsAndPunctuation) {
            if (Character.isLetter(word.charAt(0))) {
                builder.append(word.substring(1));
                builder.append(word.charAt(0));
                builder.append("ay ");
            } else {
                builder.append(word);
                builder.append(" ");
            }
        }
        return builder.toString().trim();
    }
}

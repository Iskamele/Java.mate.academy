package section00_DailyTasks.JavaHibernate.Hard.T01_SimplePigLatin.mentor;

public class SimplePigLatin {
    public static String toSimplePigLatin(String string) {
        String[] words = string.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].matches("[a-zA-Z]+")) {
                words[i] = words[i].substring(1) + words[i].substring(0, 1) + "ay";
            }
        }
        return String.join(" ", words);
    }
}

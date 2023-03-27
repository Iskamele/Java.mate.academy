package section00_DailyTasks.JavaCore.Normal.T05_RemoveAllVowels;

public class Vowels {
    public static String removeVowel(String string) {
        return string.replaceAll("[aeuioAEUIO]", "");
    }
}

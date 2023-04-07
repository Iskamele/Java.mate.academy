package section00_DailyTasks.JavaWeb.Normal.T03_FixStringCase;

public class CaseConverter {
    private static final String LOWER_CASE_REGEX = "[a-z]";
    private static final String ANY_NON_WORD_REGEX = "\\W";

    public static String convertString(String string) {
        String removeSpaces = string.replaceAll(ANY_NON_WORD_REGEX, "");
        int lowerCaseLettersCount = (int) removeSpaces.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .filter(s -> s.matches(LOWER_CASE_REGEX))
                .count();
        String removeLowerCaseLetters = removeSpaces.replaceAll(LOWER_CASE_REGEX, "");
        return (removeSpaces.length() <= lowerCaseLettersCount) ? string.toLowerCase() : string.toUpperCase();
    }
}

package section00_DailyTasks.JavaCore.Easy.T19_ToAlternativeCase.Mentor;

public class AlternativeString {
    public static String toAlternativeCase(String string) {
        StringBuilder result = new StringBuilder();
        for (char letter : string.toCharArray()) {
            if (Character.isUpperCase(letter)) {
                result.append(Character.toLowerCase(letter));
            } else {
                result.append(Character.toUpperCase(letter));
            }
        }
        return result.toString();
    }
}

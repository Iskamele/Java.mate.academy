package section00_DailyTasks.JavaCore.Easy.T19_ToAlternativeCase;

public class AlternativeString {
    public static String toAlternativeCase(String string) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (Character.isUpperCase(c)) {
                builder.append(Character.toLowerCase(c));
                continue;
            }
            if (Character.isLowerCase(c)) {
                builder.append(Character.toUpperCase(c));
                continue;
            }
            builder.append(c);
        }
        return builder.toString();
    }
}

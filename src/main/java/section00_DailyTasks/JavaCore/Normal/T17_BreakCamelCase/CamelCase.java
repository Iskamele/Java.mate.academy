package section00_DailyTasks.JavaCore.Normal.T17_BreakCamelCase;

public class CamelCase {
    public static String breakCamelCase(String input) {
        if (input.isEmpty()) {
            return input;
        }
        StringBuilder builder = new StringBuilder();
        char[] chars = input.toCharArray();
        builder.append(chars[0]);
        for (int i = 1; i < chars.length; i++){
            if (Character.isUpperCase(chars[i])) {
                builder.append(" ");
            }
            builder.append(chars[i]);
        }
        return builder.toString();
    }
}

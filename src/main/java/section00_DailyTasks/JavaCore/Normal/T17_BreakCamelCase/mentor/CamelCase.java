package section00_DailyTasks.JavaCore.Normal.T17_BreakCamelCase.mentor;

public class CamelCase {
    public static String breakCamelCase(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            String letter = Character.toString(input.charAt(i));
            if (Character.isUpperCase(input.charAt(i))) {
                result.append(" ");
            }
            result.append(letter);
        }
        return result.toString();
    }
}

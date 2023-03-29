package section00_DailyTasks.JavaCore.Hard.T01_ValidParentheses;

public class ValidParentheses {
    public static boolean isValidParentheses(String string) {
        int count = 0;
        for (int c : string.chars().toArray()) {
            if (count < 0) {
                return false;
            }
            if (c == '(') {
                count++;
            }
            if (c == ')') {
                count--;
            }
        }
        return count == 0;
    }
}

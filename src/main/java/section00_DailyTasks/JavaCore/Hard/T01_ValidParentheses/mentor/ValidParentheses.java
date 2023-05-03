package section00_DailyTasks.JavaCore.Hard.T01_ValidParentheses.mentor;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValidParentheses(String string) {
        Stack<Character> stack = new Stack<>();
        for (char ch : string.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            }
            if (ch == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
        }

        return stack.isEmpty();
    }
}

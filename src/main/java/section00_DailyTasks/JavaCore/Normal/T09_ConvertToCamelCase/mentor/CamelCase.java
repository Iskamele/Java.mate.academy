package section00_DailyTasks.JavaCore.Normal.T09_ConvertToCamelCase.mentor;

public class CamelCase {
    public static String convertToCamelCase(String string) {
        String result = "";
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '-' || chars[i] == '_') {
                result += Character.toUpperCase(chars[i + 1]);
                i++;
            } else {
                result += chars[i];
            }
        }
        return result;
    }
}

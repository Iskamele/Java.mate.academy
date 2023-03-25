package section00_DailyTasks.JavaCore.Easy.T01_SecretMessage;

public class SecretMessage {
    public static String greet(String name) {
        if (name.equals("Johnny")) {
            return "Hello, my love!";
        }
        return String.format("Hello, %s!", name);
    }
}

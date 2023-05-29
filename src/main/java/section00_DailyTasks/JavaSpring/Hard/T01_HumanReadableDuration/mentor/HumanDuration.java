package section00_DailyTasks.JavaSpring.Hard.T01_HumanReadableDuration.mentor;

public class HumanDuration {
    public static String formatDuration(int seconds) {
        String result = "";
        int[] units = new int[]{31536000, 86400, 3600, 60, 1};
        String[] labels = new String[]{"year", "day", "hour", "minute", "second"};
        if (seconds == 0) {
            return "now";
        }
        for (int i = 0; i < 5; i++) {
            if (seconds >= units[i]) {
                int quantity = seconds / units[i];
                seconds = seconds % units[i];
                result += (result.equals("") ? "" : (seconds == 0 ? " and " : ", "))
                        + quantity + " " + labels[i] + (quantity > 1 ? "s" : "");
            }
        }
        return result;
    }
}

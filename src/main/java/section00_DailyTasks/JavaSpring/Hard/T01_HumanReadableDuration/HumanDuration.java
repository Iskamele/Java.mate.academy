package section00_DailyTasks.JavaSpring.Hard.T01_HumanReadableDuration;

public class HumanDuration {
    private static final int SECONDS_IN_MINUTE = 60;
    private static final int MINUTES_IN_HOUR = 60;
    private static final int HOURS_IN_DAY = 24;
    private static final int DAYS_IN_YEAR = 365;

    public static String formatDuration(int seconds) {
        if (seconds == 0) {
            return "now";
        }
        int minutes = seconds / SECONDS_IN_MINUTE;
        int remainingSeconds = seconds - minutes * SECONDS_IN_MINUTE;
        int hours = minutes / MINUTES_IN_HOUR;
        minutes = minutes - hours * MINUTES_IN_HOUR;
        int days = hours / HOURS_IN_DAY;
        hours = hours - days * HOURS_IN_DAY;
        int years = days / DAYS_IN_YEAR;
        days = days - years * DAYS_IN_YEAR;
        StringBuilder formattedTime = new StringBuilder();
        if (years > 0) {
            formattedTime.append(years);
            formattedTime.append(years == 1 ? " year" : " years");
            formattedTime.append(", ");
        }
        if (days > 0) {
            formattedTime.append(days);
            formattedTime.append(days == 1 ? " day" : " days");
            formattedTime.append(", ");
        }
        if (hours > 0) {
            formattedTime.append(hours);
            formattedTime.append(hours == 1 ? " hour" : " hours");
            formattedTime.append(", ");
        }
        if (minutes > 0) {
            formattedTime.append(minutes);
            formattedTime.append(minutes == 1 ? " minute" : " minutes");
            formattedTime.append(", ");
        }
        if (remainingSeconds > 0) {
            formattedTime.append(remainingSeconds);
            formattedTime.append(remainingSeconds == 1 ? " second" : " seconds");
        }
        String result = formattedTime.toString().trim();
        if (result.endsWith(",")) {
            result = result.substring(0, result.length() - 1);
        }
        int lastCommaIndex = result.lastIndexOf(",");
        if (lastCommaIndex != -1) {
            result = result.substring(0, lastCommaIndex) + " and" + result.substring(lastCommaIndex + 1);
        }
        if (result.endsWith(" and")) {
            result = result.substring(0, result.length() - 4);
        }
        return result;
    }
}

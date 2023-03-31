package section00_DailyTasks.JavaJDBC.Hard.T01_HumanReadableTime;

public class HumanTime {
    public static String convertTime(int seconds) {
        if (seconds > 359999) {
            throw new RuntimeException("The maximum number of seconds is 359999 (99:59:59).");
        }
        int hh = seconds / 3600;
        int mm = (seconds - (hh * 3600)) / 60;
        int ss = seconds - (hh * 3600) - (mm * 60);
        return String.format("%02d:%02d:%02d", hh, mm, ss);
    }
}

package section00_DailyTasks.JavaCore.Hard.T04_CountIPAddresses.mentor;

public class IPAddresses {
    public static long countIPBetween(String start, String end) {
        return convertToLong(end) - convertToLong(start);
    }

    private static long convertToLong(String string) {
        long result = 0;
        for (String ip : string.split("[.]")) {
            result = result * 256 + Long.parseLong(ip);
        }
        return result;
    }
}

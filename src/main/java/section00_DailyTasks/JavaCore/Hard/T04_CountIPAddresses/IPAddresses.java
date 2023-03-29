package section00_DailyTasks.JavaCore.Hard.T04_CountIPAddresses;

public class IPAddresses {
    private static final long CAP = 256L;
    private static final int IP_V4_SIZE = 3;

    public static long countIPBetween(String start, String end) {
        long[] startIp = stringIpToIntArray(start);
        long[] endIp = stringIpToIntArray(end);
        long result = 0;
        for (int i = 0; i < 4; i++) {
            long diff = endIp[i] - startIp[i];
            result += diff * Math.pow(CAP, IP_V4_SIZE - i);
        }
        return result;
    }

    private static long[] stringIpToIntArray(String value) {
        String[] splitString = value.split("\\.");
        long[] ip = new long[splitString.length];
        for (int i = 0; i < splitString.length; i++) {
            ip[i] = Long.parseLong(splitString[i]);
        }
        return ip;
    }
}

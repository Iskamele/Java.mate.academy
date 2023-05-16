package section00_DailyTasks.JavaHibernate.Normal.T01_DefangingIpAddress.mentor;

public class IPDefanger {
    public static String defangIPAddress(String address) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                result.append("[.]");
            } else {
                result.append(address.charAt(i));
            }
        }
        return result.toString();
    }
}

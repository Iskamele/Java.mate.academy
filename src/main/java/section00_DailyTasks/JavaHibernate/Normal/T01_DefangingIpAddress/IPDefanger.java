package section00_DailyTasks.JavaHibernate.Normal.T01_DefangingIpAddress;

public class IPDefanger {
    public static String defangIPAddress(String address) {
        return address.replaceAll("\\.", "[.]");
    }
}

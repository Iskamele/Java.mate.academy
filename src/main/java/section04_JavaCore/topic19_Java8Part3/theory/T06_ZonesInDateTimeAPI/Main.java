package section04_JavaCore.topic19_Java8Part3.theory.T06_ZonesInDateTimeAPI;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TimeZone;

public class Main {

    public static void main(String[] args) {
        // Java 8: DateTime API
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        TimeZone timeZone = TimeZone.getDefault();
        System.out.println(timeZone.getDisplayName());
        ZoneId zoneId = timeZone.toZoneId();
        System.out.println(zoneId);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }
}

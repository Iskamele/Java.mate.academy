package section04_JavaCore.topic19_Java8Part3.theory.T05_DateTimeAPIWhatIsNow;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Methods {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalTime localTime = localDateTime.toLocalTime();
        LocalDate localDate = localDateTime.toLocalDate();

        LocalDate parsed = LocalDate.parse("2020-11-22");
        System.out.println(parsed);
        System.out.println(parsed.getYear());
        System.out.println(parsed.getMonth().getValue());
        System.out.println(parsed.getDayOfMonth());
    }
}

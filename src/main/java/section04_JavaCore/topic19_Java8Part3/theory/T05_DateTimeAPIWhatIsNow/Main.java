package section04_JavaCore.topic19_Java8Part3.theory.T05_DateTimeAPIWhatIsNow;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        // Java 8: DateTime API

        // Current time
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        System.out.println();

        // Add time
        System.out.println(currentDate.plusDays(4));
        LocalDate localDate = currentDate.plusYears(4);
        System.out.println(localDate);
        System.out.println(currentDate); // Работает по аналогии со String. Класс immutable

        System.out.println();

        // Specific format
        System.out.println(currentDate.format(DateTimeFormatter.ofPattern("dd-yyyy-MM")));

        System.out.println();

        // Display time
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        System.out.println();

        // Display only time
        LocalTime localTime = localDateTime.toLocalTime();
        System.out.println(localTime);

    }
}

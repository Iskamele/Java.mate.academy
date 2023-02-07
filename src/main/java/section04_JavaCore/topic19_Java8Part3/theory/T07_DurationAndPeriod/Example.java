package section04_JavaCore.topic19_Java8Part3.theory.T07_DurationAndPeriod;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Example {
    /**
     * Задача: есть купон на скидку, который действует всего 48 часов
     * с момента выдачи купона
     */

    public static void main(String[] args) {
        Duration duration = Duration.ofHours(48);
        LocalDateTime couponReleasedAt = LocalDateTime
                .of(LocalDate.now(), LocalTime.of(10, 0));
        boolean isValid = couponReleasedAt.plus(duration)
                .isAfter(LocalDateTime.now());
        System.out.println(isValid);
    }
}

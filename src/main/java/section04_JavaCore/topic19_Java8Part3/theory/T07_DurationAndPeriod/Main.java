package section04_JavaCore.topic19_Java8Part3.theory.T07_DurationAndPeriod;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class Main {

    public static void main(String[] args) {
        // Java 8L DateTime API

        // Duration duration; // Промежутки в часов, минут, секунд..
        // Period period; // Промежутки в годах, месяцах, днях..

        Duration duration = Duration.ofHours(5);
        Period period = Period.ofYears(10);
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Now: " + now);
        System.out.println("Now + duration: " + now.plus(duration));
        System.out.println("Now + period: " + now.plus(period));
        System.out.println("Now + duration + period: " + now.plus(duration).plus(period));
    }
}

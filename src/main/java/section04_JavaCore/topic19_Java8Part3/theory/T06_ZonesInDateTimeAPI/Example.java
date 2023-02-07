package section04_JavaCore.topic19_Java8Part3.theory.T06_ZonesInDateTimeAPI;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class Example {
    /**
     * Предыстория:
     * Есть проект, который работает в разных time-зонах или если у нас есть
     * несколько серверов, которые находятся в разных частях мира, например:
     * - есть серверы Амозона или Гугла, которые находятся во Франкфурте, Калифорнии
     * и, например, Австралии или Японии. Все эти страны находятся в разных часовых зонах.
     * <p>
     * Задача: необходимо выполнить определённую задачу в чётко обозначенное время,
     * например в 12:00 по Гринвичу
     */

    public static void main(String[] args) {
        // Дата в нашей зоне
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        System.out.println();

        // Получаем значение времени в Австралии, Сидней
        ZonedDateTime australia = ZonedDateTime.of(LocalDateTime.now(),
                ZoneId.of(ZoneId.SHORT_IDS.get("AET")));
        System.out.println(australia);

        System.out.println();

        // Задание: получать текущее значение времени в Сиднее
        // Находим разницу между Сиднеем и Гринвичем
        ZoneId australiaZoneId = ZoneId.of(ZoneId.SHORT_IDS.get("AET"));
        ZoneOffset offset = australiaZoneId.getRules().getOffset(LocalDateTime.now()); // По сути смещение по времени, относительно Гринвича
        System.out.println(offset);

        // Получаем время в Сиднее
        LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.now(), offset);
        System.out.println(localDateTime);
    }
}

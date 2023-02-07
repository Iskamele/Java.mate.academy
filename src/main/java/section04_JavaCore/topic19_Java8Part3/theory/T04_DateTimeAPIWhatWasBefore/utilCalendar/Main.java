package section04_JavaCore.topic19_Java8Part3.theory.T04_DateTimeAPIWhatWasBefore.utilCalendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        // Java 8: DateTime API
        // - java.util.Date
        // - java.util.Calendar
        // - external library (joda-time)

        // - now we can add day or week or hour
        // - problem: what means 'calendar.add(3, 3);'?
        // - how to format to specific format?
        // - how to get the 'time' only?

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        System.out.println();

        // Non readable format
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        System.out.println(dateFormat.format(calendar.getTime()));

        // - how to add some days to current date?
        // Такой код тяжело читать и дебажить, а следовательно и поддерживать
        calendar.add(1,3);
        System.out.println(dateFormat.format(calendar.getTime()));

        // тоже слабочитаемый код
        calendar.add(Calendar.YEAR, 10);
        System.out.println(dateFormat.format(calendar.getTime()));

        // - how to get the 'time' only?
        System.out.println(calendar.get(Calendar.HOUR));
    }
}

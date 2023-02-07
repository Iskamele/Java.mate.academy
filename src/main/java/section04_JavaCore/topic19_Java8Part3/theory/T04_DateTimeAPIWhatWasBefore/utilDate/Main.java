package section04_JavaCore.topic19_Java8Part3.theory.T04_DateTimeAPIWhatWasBefore.utilDate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // Java 8: DateTime API
        // - java.util.Date
        // - java.util.Calendar
        // - external library (joda-time)

        // Old version
        // - how to get the 'time' only?
        // - how to add some days to current date?
        // - how to format to specific format?

        // нельзя добавлять к даже несколько дней-лет-ид-и-тп
        Date date = new Date();
        // date.plusDays(7);

        // нельзя получить только время
        System.out.println(date);

        // нельзя вывести дату в определённом формате без лишнего объекта
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        System.out.println(simpleDateFormat.format(date));

        // Java 8
    }
}

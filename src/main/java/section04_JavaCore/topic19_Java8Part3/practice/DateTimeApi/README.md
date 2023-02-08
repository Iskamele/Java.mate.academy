1.  Return the current date as a String depending on a query.

    The query can be passed for the whole date or for it's part:


-   FULL - current date as a whole: year, month, day of month formatted as `YYYY-MM-DD` (a default return value);
-   YEAR - current year;
-   MONTH - name of the current month;
-   DAY - current day of month; In any other case throw DateTimeException.

2.  Given an Array of 3 elements, where

-   1-st element is a `year`;
-   2-nd element is s `month`;
-   3-rd element is a `day of month`;

Return date built from these elements.

3.  Given the time and the number of hours to add, return the changed time.

4.  Given the time and the number of minutes to add, return the changed time.

5.  Given the time and the number of seconds to add, return the changed time.

6.  Given the date and the number of weeks to add, return the changed date.

7.  Given a random `someDate` date, return one of the following Strings:


-   "`someDate` is after `currentDate`" - if `someDate` is in the future relating to the `current date`;
-   "`someDate` is before `currentDate`" - if `someDate` is in the past relating to the `current date`;
-   "`someDate` is today" - if `someDate` is today;

8.  Given a String representation of a date and some timezone, return LocalDateTime in this timezone.

9.  Given some LocalDateTime, return an OffsetDateTime with the local time offset applied (`+02:00` for Ukraine).

    Example: we receive a LocalDateTime with a value `2019-09-06T13:17`. We should return the OffsetDateTime with a value `2019-09-06T13:17+02:00`, where `+02:00` is the offset for our local timezone.

    OffsetDateTime is recommended to use for storing date values in a database.

10.  Given a String formatted as `yyyymmdd`, return date as a LocalDate built from this String.

11.  Given a String formatted as `d MMM yyyy` (MMM - Sep, Oct, etc), return date as a LocalDate built from this String.

12.  Given some LocalDateTime, return a String formatted as `day(2-digit) month(full name in English) year(4-digit) hours(24-hour format):minutes`.

Example: "01 January 2000 18:00".

### DateTime API[](https://mate-academy.github.io/jv-program-common-mistakes/java-core/java-eight-part-two/date-time-api#datetime-api)

#### Don’t complicate if-else construction.[](https://mate-academy.github.io/jv-program-common-mistakes/java-core/java-eight-part-two/date-time-api#dont-complicate-if-else-construction)

[Videos with example](https://www.youtube.com/watch?v=P-UmyrbGjwE&list=PL7FuXFaDeEX1smwnp-9ri8DBpgdo7Msu2)

#### If you create a formatter/use custom timezone, make it a constant field. Remember about informative names and `private` access modifiers.[](https://mate-academy.github.io/jv-program-common-mistakes/java-core/java-eight-part-two/date-time-api#if-you-create-a-formatteruse-custom-timezone-make-it-a-constant-field-remember-about-informative-names-and-private-access-modifiers)

#### Avoid magic numbers in your code.[](https://mate-academy.github.io/jv-program-common-mistakes/java-core/java-eight-part-two/date-time-api#avoid-magic-numbers-in-your-code)

They should be constants.

#### Avoid calling LocalDate.now multiple times in one method. Let’s create a variable in the method for this purpose.[](https://mate-academy.github.io/jv-program-common-mistakes/java-core/java-eight-part-two/date-time-api#avoid-calling-localdatenow-multiple-times-in-one-method-lets-create-a-variable-in-the-method-for-this-purpose)

LocalDate.now() gives us a different result if the next day has come. Of course, your code won’t run for such a long time(I hope), but it’s a good habit especially if you’re working with LocalDateTime.now() method.

P.S. of course there are some cases when you need the strict current time in each point of your program even withing one execution, but this not one of those.

#### Before creating your own formatter, check out whether it is already defined in `DateTimeFormatter` class.[](https://mate-academy.github.io/jv-program-common-mistakes/java-core/java-eight-part-two/date-time-api#before-creating-your-own-formatter-check-out-whether-it-is-already-defined-in-datetimeformatter-class)

[Documentation](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/format/DateTimeFormatter.html)
package java_04;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.GregorianCalendar;

public class DateTimeExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now(); // data aktuale
        LocalDateTime dateTime = LocalDateTime.now(); // data dhe koha aktuale
        GregorianCalendar gregorianCalendar = new GregorianCalendar();

        System.out.println("Date: " + date);
        System.out.println("Date and time: " + dateTime);
        System.out.println("Gregorian calendar: " + gregorianCalendar.getTime());
        System.out.println("Gregorian timezone: " + gregorianCalendar.getTimeZone());
    }
}

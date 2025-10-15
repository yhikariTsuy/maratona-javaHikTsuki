package academy.devdojo.javaoneforall.javacore.rdate.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class LocalDateTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2016, Month.APRIL, 25);
        LocalDate today = LocalDate.now();
        System.out.println(date.isLeapYear());
        System.out.println(date.get(ChronoField.YEAR_OF_ERA));
        System.out.println(date);
        System.out.println(today);
        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);

    }
}

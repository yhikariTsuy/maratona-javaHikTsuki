package academy.devdojo.javaoneforall.javacore.rdate.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(23, 52, 12);
        System.out.println(localTime);
        LocalTime now = LocalTime.now();
        System.out.println(now);
        System.out.println(now.get(ChronoField.CLOCK_HOUR_OF_AMPM));
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);
    }
}

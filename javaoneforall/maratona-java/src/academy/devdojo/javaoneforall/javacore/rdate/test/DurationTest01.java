package academy.devdojo.javaoneforall.javacore.rdate.test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = now.plusYears(2);
        LocalTime timeNow =  LocalTime.now();
        LocalTime timeMinusSevenHours = timeNow.minusHours(7);
        Duration duration1 = Duration.between(now, nowAfterTwoYears);
        Duration duration2 = Duration.between(timeNow, timeMinusSevenHours).abs();
        Duration duration3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));
        Duration duration4 = Duration.ofDays(20);
        Duration duration5 = Duration.ofMinutes(3);
        Duration duration6 = Duration.of(3, ChronoUnit.HOURS);
        System.out.println(duration1);
        System.out.println(duration2);
        System.out.println(duration3);
        System.out.println(duration4);
        System.out.println(duration5);
        System.out.println(duration6);
    }
}

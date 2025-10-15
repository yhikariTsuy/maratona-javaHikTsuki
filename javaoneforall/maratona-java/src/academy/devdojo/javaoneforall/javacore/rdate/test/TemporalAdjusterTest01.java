package academy.devdojo.javaoneforall.javacore.rdate.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class getNextWorkDay implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));

        int addDays = switch (dayOfWeek) {
            case THURSDAY -> 4;
            case FRIDAY -> 3;
            case SATURDAY -> 2;
            default -> 1;
        };

        return temporal.plus(addDays, ChronoUnit.DAYS);
    }
}

public class TemporalAdjusterTest01 {
    public static void main(String[] args) {
        LocalDate now =  LocalDate.now();
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(new getNextWorkDay());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.of(2025, 10, 13).with(new getNextWorkDay());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

    }
}

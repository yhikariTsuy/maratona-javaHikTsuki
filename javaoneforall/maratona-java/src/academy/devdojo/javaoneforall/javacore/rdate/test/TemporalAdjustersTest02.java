package academy.devdojo.javaoneforall.javacore.rdate.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest02 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, Month.JANUARY, 14);
        System.out.println("Today is: " + date.getDayOfWeek());
        System.out.println("Day: " + date);

        System.out.println("============");

        LocalDate nextWorkDay = getNextWorkDay(date);
        System.out.println("Next work day: " + nextWorkDay.getDayOfWeek());
        System.out.println("Day: " + nextWorkDay);

    }

    static LocalDate getNextWorkDay(LocalDate date) {
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        LocalDate nextWorkDay;
        if(dayOfWeek.equals(DayOfWeek.FRIDAY) || dayOfWeek.equals(DayOfWeek.SATURDAY)) {
            nextWorkDay = date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        } else {
            nextWorkDay = date.plusDays(1);
        }
        return nextWorkDay;
    }
}

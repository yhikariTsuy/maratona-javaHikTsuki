package academy.devdojo.javaoneforall.javacore.rdate.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        if (c.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Sunday it's the first day of the week!");
        }

        c.add(Calendar.DAY_OF_MONTH, 2);
        c.roll(Calendar.HOUR, 12);
        Date date = c.getTime();
        System.out.println(date);
    }
}

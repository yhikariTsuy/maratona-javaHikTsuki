package academy.devdojo.javaoneforall.javacore.sformat.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String date1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String date2= date.format(DateTimeFormatter.ISO_DATE);
        String date3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);

        LocalDate parse1 = LocalDate.parse("20251010", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2025-10-10+05:00", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2025-10-10", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime now = LocalDateTime.now();
        String date4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(date4);

        LocalDateTime parse4 = LocalDateTime.parse("2025-10-10T15:13:22.2505054", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parse4);

        // dd/MM/yyyy
        // MM/dd/yyyy
        // yyyy/MM/dd

        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(formatterBR);
        System.out.println(formatBR);
        LocalDate parseBR = LocalDate.parse("19/04/2012", formatterBR);
        System.out.println(parseBR);

        DateTimeFormatter formatterCN = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.CANADA);
        String formatCN = LocalDate.now().format(formatterCN);
        System.out.println(formatCN);

        LocalDate parseCN = LocalDate.parse("10.February.2023", formatterCN);
        System.out.println(parseCN);
    }
}

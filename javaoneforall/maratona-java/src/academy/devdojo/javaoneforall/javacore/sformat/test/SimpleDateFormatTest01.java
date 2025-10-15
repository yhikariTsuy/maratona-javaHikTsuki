package academy.devdojo.javaoneforall.javacore.sformat.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String pattern = "'Amsterdam' dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));

        try {
            System.out.println(sdf.parse("Amsterdam 07 de abril de 2025"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}

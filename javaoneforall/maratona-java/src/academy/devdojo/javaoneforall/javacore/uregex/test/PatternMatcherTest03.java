package academy.devdojo.javaoneforall.javacore.uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // \d = All digits
        // \D = Everything that is not a digit
        // \s = Spaces  \t \n \f \r
        // \S = Everything that is not a space
        // \w = a-z, A-Z, digits, _
        // \W = Everythin that is not inclued in \w
        // [] = range [a-z A-Z] until z, *space*, A until Z
        // ? zero or one
        // * zero or more
        // + one or more
        // {n, m} n until m
        // ()
        // |
        // $
        // . 1.3 = 123, 133, 1@3, 1A3
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String txt = "thorfinn@gmail.com, 14thors14@hotmail.com, #@!einar@mail.com, test@gmail.com.br, askeladd@mail";
        System.out.println(Arrays.toString(txt.split(", ")));
        System.out.println("position 1: " + txt.split(", ")[1]);

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(txt);
        System.out.println("\n=========================================\n");
        System.out.println("regex: " + regex);
        System.out.println("positions founded: ");
        while(matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }

    }
}

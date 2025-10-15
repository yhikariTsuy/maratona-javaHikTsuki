package academy.devdojo.javaoneforall.javacore.uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        // \d = All digits
        // \D = Everything that is not a digit
        // \s = Spaces  \t \n \f \r
        // \S = Everything that is not a space
        // \w = a-z, A-Z, digits, _
        // \W = Everythin that is not inclued in \w
        // [] = range [a-z A-Z] until z, *space*, A until Z

//        String regex = "[a-eA-U]";
        String regex = "0[xX][0-9a-fA-F]"; // verify if is a valid hexadecimal number and denoted the subgroups;
//        String txt = "Undertale ";
        String txt2 = "14 0x 0X 0xFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(txt2);
        System.out.println("text " + txt2);
        System.out.println("index: 0123456789" );
        System.out.println("regex: " + regex);
        System.out.println("positions founded: " );
        while(matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }

    }
}

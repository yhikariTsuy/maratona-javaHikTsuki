package academy.devdojo.javaoneforall.javacore.qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String name = "William Suane";
        name.concat(" DevDojo");
        name.substring(0, 3);

        System.out.println(name);

        StringBuilder sb = new StringBuilder("William Suane");
        sb.append(" DevDojo").append(" Academy");
        System.out.println(sb);
        sb.reverse();
        sb.reverse();
        System.out.println(sb);
        sb.delete(0, 3);
        System.out.println(sb);
    }
}

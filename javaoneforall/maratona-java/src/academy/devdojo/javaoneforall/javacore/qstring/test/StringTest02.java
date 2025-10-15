package academy.devdojo.javaoneforall.javacore.qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String name = "  Akira  ";
        System.out.println(name.charAt(0));
        System.out.println(name.length());
        System.out.println(name.replace("r", "m"));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        String nums = "012345";
        System.out.println(nums.substring(0, 4));

        System.out.println(name.trim());

    }
}

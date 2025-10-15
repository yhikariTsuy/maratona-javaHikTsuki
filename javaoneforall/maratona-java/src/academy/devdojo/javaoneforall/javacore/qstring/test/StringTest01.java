package academy.devdojo.javaoneforall.javacore.qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Hik"; // String Constant Pool
        String nome2 = "Hik";
        nome = nome.concat("ari");
        System.out.println(nome);
        String nome3 = new String("Hik"); // <-- usually is rare for use
        System.out.println(nome == nome2);
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());

        /*
          1. var of reference; 2. obj type's string; 3.  string in string's pool.
         */

    }
}

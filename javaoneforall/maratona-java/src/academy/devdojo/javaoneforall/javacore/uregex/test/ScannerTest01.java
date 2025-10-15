package academy.devdojo.javaoneforall.javacore.uregex.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String txt = "Spike, Jet, Faye, true, 200";
        String[]names = txt.split(", ");
        for(String name : names){
            System.out.println(name.trim());
        }
    }
}

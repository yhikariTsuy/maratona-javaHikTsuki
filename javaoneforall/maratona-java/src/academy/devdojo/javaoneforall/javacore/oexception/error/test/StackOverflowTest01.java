package academy.devdojo.javaoneforall.javacore.oexception.error.test;

public class StackOverflowTest01 {
    public static void main(String[] args) {
        recursivity();
    }

    public static void recursivity(){
        recursivity();
    }

}


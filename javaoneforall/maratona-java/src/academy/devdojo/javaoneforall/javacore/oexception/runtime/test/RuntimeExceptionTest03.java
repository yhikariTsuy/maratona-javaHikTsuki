package academy.devdojo.javaoneforall.javacore.oexception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        openConnection2();
    }

    private static String openConnection() {
        try {
            System.out.println("Opening file");
            System.out.println("Writing dates in file");
            return "Open Connection";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Closing resource allowed by OS");
        }
        return null;
    }

    private static void openConnection2() {
        try {
            System.out.println("Opening file");
            System.out.println("Writing dates in file");
            throw new RuntimeException();
        } finally {
            System.out.println("Closing resource allowed by OS");
        }
    }

}

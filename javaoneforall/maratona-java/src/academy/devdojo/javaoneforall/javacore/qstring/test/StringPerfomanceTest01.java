package academy.devdojo.javaoneforall.javacore.qstring.test;

public class StringPerfomanceTest01 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        concatString(10_000);
        long end = System.currentTimeMillis();
        System.out.println("Time for String: " + (end - start) + "ms");

        start = System.currentTimeMillis();
        concatStringBuilder(1_000_000);
        end = System.currentTimeMillis();
        System.out.println("Time for StringBuilder: " + (end - start) + "ms");

        start = System.currentTimeMillis();
        concatStringBuffer(1_000_000);
        end = System.currentTimeMillis();
        System.out.println("Time for StringBuffer: " + (end - start) + "ms");
    }

    private static void concatString(int size) {
        String str1 = "";
        for (int i = 0; i < size; i++) {
            str1 += i;
        }
    }

    private static void concatStringBuilder(int size) {
        StringBuilder strB1 = new StringBuilder(size);
        for (int i = 0; i <= size; i++) {
            strB1.append(i); // 0, 01, 012, 0123, ...
        }
    }

    private static void concatStringBuffer(int size) {
        StringBuffer strBF1 = new StringBuffer(size);
        for (int i = 0; i <= size; i++) {
            strBF1.append(i);
        }
    }
}

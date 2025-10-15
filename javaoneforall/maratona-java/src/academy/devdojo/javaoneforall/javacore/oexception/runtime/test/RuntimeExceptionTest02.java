package academy.devdojo.javaoneforall.javacore.oexception.runtime.test;

import java.io.IOException;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        divide(1, 0);
    }

    /**
     * @param a
     * @param b can't be zero
     * @return
     * @throws IllegalArgumentException if b = 0
     */

    private static int divide(int a, int b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("Ilegal argument, divide by zero");
        }
        return a / b;
    }
}

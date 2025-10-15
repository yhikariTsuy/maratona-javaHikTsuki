package academy.devdojo.javaoneforall.javacore.oexception.runtime.test;

import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        // "exceções mais genéricas sempre ao final."

        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("Inside of ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Inside of IndexOutOfBoundsException");
        } catch (RuntimeException e) {
            System.out.println("Inside of RuntimeException");
        }


        try {
            maybeThrowException();
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }

    private static void maybeThrowException() throws SQLException, IOException {

    }
}

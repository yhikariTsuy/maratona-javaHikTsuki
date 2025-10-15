package academy.devdojo.javaoneforall.javacore.oexception.exception.domain;

public class InvalidLoginException extends Exception {
    public InvalidLoginException() {
        super("Invalid Login Exception");
    }

    public InvalidLoginException(String message) {
        super(message);
    }
}

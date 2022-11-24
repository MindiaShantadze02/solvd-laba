package exceptions;

public class AgeException extends Exception {
    AgeException() {
        super("Invalid age");
    }

    AgeException(String message) {
        super(message);
    }
}

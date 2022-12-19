package exceptions;

public class InvalidSeatException extends Exception {
    public InvalidSeatException() {
        super("Invalid seat is selected");
    }

    public InvalidSeatException(String message) {
        super(message);
    }
}

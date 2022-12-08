package exceptions;

public class InvalidPassengerCountException extends Exception {
    public InvalidPassengerCountException() {
        super("Passenger numbers is invalid");
    }

    public InvalidPassengerCountException(String message) throws InvalidSeatException, InvalidPassengerCountException {
        super(message);
    }
}

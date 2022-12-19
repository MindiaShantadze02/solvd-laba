package exceptions;

public class InvalidVehicleCountException extends Exception{
    InvalidVehicleCountException() {
        super("Invalid vehicle count");
    }

    public InvalidVehicleCountException(String message) {
        super(message);
    }
}

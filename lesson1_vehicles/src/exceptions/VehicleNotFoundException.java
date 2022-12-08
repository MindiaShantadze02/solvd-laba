package exceptions;

public class VehicleNotFoundException extends Exception {
    VehicleNotFoundException() {
        super("Vehicle not found");
    }

    public VehicleNotFoundException(String message) {
        super(message);
    }
}

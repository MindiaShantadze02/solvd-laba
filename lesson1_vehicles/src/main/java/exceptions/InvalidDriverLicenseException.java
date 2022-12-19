package exceptions;

public class InvalidDriverLicenseException extends Exception {
    public InvalidDriverLicenseException() {
        super("Invalid driver license");
    }

    public InvalidDriverLicenseException(String message) {
        super(message);
    }
}

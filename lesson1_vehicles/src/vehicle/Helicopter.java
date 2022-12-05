package vehicle;

import exceptions.AgeException;
import exceptions.InvalidDriverLicenseException;
import interfaces.Flyable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import passenger.Passenger;

public final class Helicopter extends Vehicle implements Flyable {
    private static final Logger logger = LogManager.getLogger(Helicopter.class);
    public void fly() {
        System.out.println("Helicopter is flying");
    }

    public void land() {
        System.out.println("Helicopter is landing on H sign");
    }

    @Override
    public void move(Passenger driver) throws AgeException, InvalidDriverLicenseException {
        try {
            String driverLicenseType = driver.getDriverLicense().getType();

            if (driver.getAge() < 25) {
                throw new AgeException("You must be at least 25 years old to drive a helicopter");
            } else if (driverLicenseType == "Flying Vehicle") {
                throw new InvalidDriverLicenseException("Invalid driver license type");
            } else {
                System.out.println("Helicopter started moving");
            }
        } catch(Exception e) {
            logger.error(e.getMessage());
        }

    }
}

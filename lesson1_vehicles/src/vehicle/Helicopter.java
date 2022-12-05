package vehicle;

import exceptions.AgeException;
import exceptions.InvalidDriverLicenseException;
import interfaces.Flyable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import passenger.Passenger;

public final class Helicopter extends Vehicle implements Flyable {
    private static final Logger LOGGER = LogManager.getLogger(Helicopter.class);
    public void fly() {
        LOGGER.info("Helicopter is flying");
    }

    public void land() {
        LOGGER.info("Helicopter is landing on H sign");
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
                LOGGER.info("Helicopter started moving");
            }
        } catch(AgeException e) {
            LOGGER.error(e.getMessage());
        } catch(InvalidDriverLicenseException e) {
            LOGGER.error(e.getMessage());
        } catch(Exception e) {
            LOGGER.error(e.getMessage());
        }
    }
}

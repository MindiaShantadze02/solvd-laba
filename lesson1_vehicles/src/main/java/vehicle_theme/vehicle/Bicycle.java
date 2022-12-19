package vehicle_theme.vehicle;

import enums.VehicleType;
import exceptions.AgeException;
import interfaces.Driveable;
import interfaces.Honkable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import vehicle_theme.passenger.Passenger;

import java.util.Objects;

public class Bicycle extends Vehicle implements Driveable, Honkable {
    private static final Logger logger = LogManager.getLogger(Bicycle.class);
    private int speedOptions;

    public Bicycle() {
        this.speedOptions = 0;
    }
    public Bicycle(
            String name,
            String model,
            int releaseYear,
            int maxPassengers,
            int speedOptions
    ) {
        super(name, model, releaseYear, maxPassengers);
        this.speedOptions = speedOptions;
        this.type = VehicleType.GROUND_VEHICLE;
    }

    public int getSpeedOptions() {
        return speedOptions;
    }

    public void setSpeedOptions(int speedOptions) {
        this.speedOptions = speedOptions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bicycle bicycle = (Bicycle) o;
        return speedOptions == bicycle.speedOptions;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speedOptions);
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "speedOptions=" + speedOptions +
                ", id='" + id + '\'' +
                '}';
    }

    public void move(Passenger driver) throws AgeException {
        if (driver.getAge() < 5) {
            throw new AgeException("You must be at least 5 years old to drive a bicycle");
        } else {
            System.out.println("Riding the bicycle");
        }
    }

    public void honk() {
        System.out.println("Peep peep");
    }

    public void drift() {
        System.out.println("Bicycle started drifting");
    }
}

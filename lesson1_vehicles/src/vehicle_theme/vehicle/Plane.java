package vehicle_theme.vehicle;

import exceptions.AgeException;
import exceptions.InvalidDriverLicenseException;
import interfaces.Flyable;
import vehicle_theme.passenger.Passenger;

import java.util.Objects;

public class Plane extends Vehicle implements Flyable {
    private double maxFlyingHeight;
    public Plane() {
        this.maxFlyingHeight = 0;
    }

    public Plane(
            String name,
            String model,
            int releaseYear,
            int maxPassengers
    ) {
        super(name, model, releaseYear, maxPassengers);
    }

    public double getMaxFlyingHeight() {
        return maxFlyingHeight;
    }

    public void setMaxFlyingHeight(double maxFlyingHeight) {
        this.maxFlyingHeight = maxFlyingHeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plane plane = (Plane) o;
        return Double.compare(plane.maxFlyingHeight, maxFlyingHeight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxFlyingHeight);
    }

    @Override
    public String toString() {
        return "Plane{" +
                "maxFlyingHeight=" + maxFlyingHeight +
                ", id='" + id + '\'' +
                '}';
    }

    public void fly() {
        System.out.println("plane is flying");
    }
    public void land() {
        System.out.println("Plane is landing on the airport");
    }

    public void move(Passenger driver) throws AgeException, InvalidDriverLicenseException {
        String driverLicenseType = driver.getDriverLicense().getType();

        if (driver.getAge() < 25) {
            throw new AgeException("Driver must be at least 25 years old");
        } else if (driverLicenseType == "Flying Vehicle") {
            throw new InvalidDriverLicenseException("Driver should have flying vehicle_theme.vehicle type");
        } else {
            System.out.println("Plane started moving");
        }
    }
}

package vehicle_theme.vehicle;

import enums.VehicleType;
import exceptions.AgeException;
import exceptions.InvalidDriverLicenseException;
import interfaces.Swimable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import vehicle_theme.passenger.Passenger;

import java.util.Objects;

public class Boat extends Vehicle implements Swimable {
    private static final Logger logger = LogManager.getLogger(Vehicle.class);
    private String boatType;
    private boolean isWooden;

    public Boat() {
        this.boatType = null;
        this.isWooden = false;
        this.type = VehicleType.SEA_VEHICLE;
    }

    public Boat(String name, String model, int releaseYear, int maxPassengers, String boatType, boolean isWooden) {
        super(name, model, releaseYear, maxPassengers);
        this.boatType = boatType;
        this.isWooden = isWooden;
    }

    @Override
    public void move(Passenger driver) throws AgeException, InvalidDriverLicenseException {
        String type = driver.getDriverLicense().getType();

        if (driver.getAge() < 30) {
            throw new AgeException("Driver is too young for driving boat");
        } else if (type != "Sea Vehicle") {
            throw new InvalidDriverLicenseException("The driver is not qualified for driving sea vehicles");
        } else {
            System.out.println("Boat started swimming");
        }
    }

    @Override
    public String toString() {
        return "Boat{" +
                "boatType='" + boatType + '\'' +
                ", isWooden=" + isWooden +
                ", id='" + id + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Boat boat = (Boat) o;
        return isWooden == boat.isWooden && Objects.equals(boatType, boat.boatType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(boatType, isWooden);
    }

    public void swim() {
        try {
            System.out.println("Hello I started swimming");
        } catch (Exception e) {

        }
    }
}

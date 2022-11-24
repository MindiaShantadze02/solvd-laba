package vehicle;

import exceptions.AgeException;
import exceptions.InvalidDriverLicenseException;
import passenger.Passenger;

import java.util.Objects;

public class Boat extends Vehicle{
    private String boatType;
    private boolean isWooden;

    public Boat() {
        this.boatType = null;
        this.isWooden = false;
        this.type = "Sea Vehicle";
    }

    public Boat(String name, String model, int releaseYear, int maxPassengers, Passenger driver, String boatType, boolean isWooden) {
        super(name, model, releaseYear, maxPassengers, driver);
        this.boatType = boatType;
        this.isWooden = isWooden;
        this.type = "Sea Vehicle";
    }

    public void move() throws AgeException, InvalidDriverLicenseException {
        String type = this.getDriver().getDriverLicense().getType();

        if (this.getDriver().getAge() < 30) {
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
}

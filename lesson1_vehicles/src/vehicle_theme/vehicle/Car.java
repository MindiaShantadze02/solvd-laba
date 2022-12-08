package vehicle_theme.vehicle;

import exceptions.AgeException;
import interfaces.Driveable;
import interfaces.Honkable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import vehicle_theme.passenger.Passenger;

import java.util.Objects;

public class Car extends Vehicle implements Driveable, Honkable {
    private static final Logger LOGGER = LogManager.getLogger(Vehicle.class);
    private int wheelCount;
    private int horsePower;
    private int doorNumber;

    public Car() {
        this.wheelCount = 0;
        this.horsePower = 0;
        this.doorNumber = 0;
    }

    public Car(String name, String model, int releaseYear, int maxPassengers, int wheelCount, int horsePower, int doorNumber) {
        super(name, model, releaseYear, maxPassengers);
        this.wheelCount = wheelCount;
        this.horsePower = horsePower;
        this.doorNumber = doorNumber;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public void move(Passenger driver) throws AgeException {
        try {
            if (driver.getAge() < 17) {
                throw new AgeException("Driver should be at least 18 years old");
            }
        } catch(AgeException e) {
            LOGGER.error(e.getMessage());
        }

        LOGGER.info("Car started to move");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return wheelCount == car.wheelCount && horsePower == car.horsePower && doorNumber == car.doorNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheelCount=" + wheelCount +
                ", horsePower=" + horsePower +
                ", doorNumber=" + doorNumber +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(wheelCount, horsePower, doorNumber);
    }

    public void honk() {
        System.out.println("Beep beep!");
    }

    public void drift() {
        try {
            LOGGER.info("Tires started burning");
        } catch(Exception e) {
            LOGGER.error(e.getMessage());
        }
    }
}

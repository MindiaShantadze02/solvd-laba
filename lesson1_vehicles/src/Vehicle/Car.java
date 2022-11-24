package vehicle;

import passenger.Passenger;

import java.util.Objects;

public class Car extends Vehicle{
    private int wheelCount;
    private int horsePower;
    private int doorNumber;

    public Car() {
        this.wheelCount = 0;
        this.horsePower = 0;
        this.doorNumber = 0;
        this.type = "Ground Vehicle";
    }

    public Car(String name, String model, int releaseYear, int maxPassengers, Passenger driver, int wheelCount, int horsePower, int doorNumber) {
        super(name, model, releaseYear, maxPassengers, driver);
        this.wheelCount = wheelCount;
        this.horsePower = horsePower;
        this.doorNumber = doorNumber;
        this.type = "Ground Vehicle";
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

    public void move() {
        System.out.println("Car started to move");
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
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(wheelCount, horsePower, doorNumber);
    }

}

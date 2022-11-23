package vehicle;

import passenger.Passenger;

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

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public Car(String name, String model, int releaseYear, int maxPassengers, Passenger owner, int wheelCount, int horsePower, int doorNumber) {
        super(name, model, releaseYear, maxPassengers, owner);
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

    public void move() {
        System.out.println("Car started to move");
    }
}

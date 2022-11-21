package Vehicle;

public class Car extends Vehicle{
    private int wheelCount;
    private int horsePower;
    private int doorNumber;

    public Car(int wheelCount, int horsePower, int doorNumber) {
        this.wheelCount = wheelCount;
        this.horsePower = horsePower;
        this.doorNumber = doorNumber;
    }

    public Car(String name, String model, int releaseYear, int maxPassengers, int avgSpeed, int wheelCount, int horsePower, int doorNumber) {
        super(name, model, releaseYear, maxPassengers, avgSpeed);
        this.wheelCount = wheelCount;
        this.horsePower = horsePower;
        this.doorNumber = doorNumber;
    }
}

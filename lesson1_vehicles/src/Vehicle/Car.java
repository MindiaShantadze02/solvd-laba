package vehicle;

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

    public Car(String name, String model, int releaseYear, int maxPassengers, int avgSpeed, int wheelCount, int horsePower, int doorNumber) {
        super(name, model, releaseYear, maxPassengers, avgSpeed);
        this.wheelCount = wheelCount;
        this.horsePower = horsePower;
        this.doorNumber = doorNumber;
        this.type = "Ground Vehicle";
    }
}

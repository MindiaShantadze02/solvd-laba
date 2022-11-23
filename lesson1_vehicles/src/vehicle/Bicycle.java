package vehicle;

import passenger.Passenger;

public class Bicycle extends Vehicle {
    private int speedOptions;

    public Bicycle() {
        this.type = "Ground Vehicle";
        this.speedOptions = 0;
    }
    public Bicycle(
            String name,
            String model,
            int releaseYear,
            int maxPassengers,
            Passenger owner,
            int speedOptions
    ) {
        super(name, model, releaseYear, maxPassengers, owner);
        this.type = "Ground Vehicle";
        this.speedOptions = speedOptions;
    }

    public int getSpeedOptions() {
        return speedOptions;
    }

    public void setSpeedOptions(int speedOptions) {
        this.speedOptions = speedOptions;
    }

    public void move() {
        System.out.println("Bicycle is moving");
    }
}

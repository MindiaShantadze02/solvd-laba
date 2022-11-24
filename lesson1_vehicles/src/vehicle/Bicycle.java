package vehicle;

import passenger.Passenger;

import java.util.Objects;

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
            Passenger driver,
            int speedOptions
    ) {
        super(name, model, releaseYear, maxPassengers, driver);
        this.type = "Ground Vehicle";
        this.speedOptions = speedOptions;
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
                ", type='" + type + '\'' +
                '}';
    }

    public void move() {
        if (this.getDriver().getAge() > 18) {
            System.out.println("Bicycle is moving");
        }
    }
}

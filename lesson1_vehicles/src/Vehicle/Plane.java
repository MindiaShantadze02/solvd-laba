package vehicle;

import interfaces.Flyable;
import passenger.Passenger;

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

    public void move(Passenger driver) {
        System.out.println("The plane is flying");
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
}

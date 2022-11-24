package vehicle;

import passenger.Passenger;

import java.util.Objects;

public class Plane extends Vehicle {
    private double maxFlyingHeight;

    public Plane() {
        this.type = "Flying Vehicle";
        this.maxFlyingHeight = 0;
    }

    public Plane(
            String name,
            String model,
            int releaseYear,
            int maxPassengers,
            Passenger driver,
            double maxFlyingHeight
    ) {
        super(name, model, releaseYear, maxPassengers, driver);
        this.type = "Flying Vehicle";
        this.maxFlyingHeight = maxFlyingHeight;
    }

    public double getMaxFlyingHeight() {
        return maxFlyingHeight;
    }

    public void setMaxFlyingHeight(double maxFlyingHeight) {
        this.maxFlyingHeight = maxFlyingHeight;
    }

    public void move() {
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
                ", type='" + type + '\'' +
                '}';
    }
}

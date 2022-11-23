package vehicle;

import passenger.Passenger;

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
            Passenger owner,
            double maxFlyingHeight
    ) {
        super(name, model, releaseYear, maxPassengers, owner);
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
}

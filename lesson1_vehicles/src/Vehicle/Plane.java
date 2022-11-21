package vehicle;

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
            int avgSpeed,
            double maxFlyingHeight
    ) {
        super(name, model, releaseYear, maxPassengers, avgSpeed);
        this.type = "Flying Vehicle";
        this.maxFlyingHeight = maxFlyingHeight;
    }
}

package Vehicle;

public class Bycicle extends Vehicle {
    private int speedOptions;

    public Bycicle() {
        this.type = "Ground Vehicle";
        this.speedOptions = 0;
    }
    public Bycicle(
            String name,
            String model,
            int releaseYear,
            int maxPassengers,
            int avgSpeed,
            int speedOptions
    ) {
        super(name, model, releaseYear, maxPassengers, avgSpeed);
        this.type = "Ground Vehicle";
        this.speedOptions = speedOptions;
    }
}

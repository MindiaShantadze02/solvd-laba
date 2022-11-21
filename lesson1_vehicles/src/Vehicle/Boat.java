package vehicle;

public class Boat extends Vehicle{
    private String boatType;
    private boolean isWooden;

    public Boat() {
        this.boatType = null;
        this.isWooden = false;
        this.type = "Sea Vehicle";
    }

    public Boat(String name, String model, int releaseYear, int maxPassengers, int avgSpeed, String boatType, boolean isWooden) {
        super(name, model, releaseYear, maxPassengers, avgSpeed);
        this.boatType = boatType;
        this.isWooden = isWooden;
        this.type = "Sea Vehicle";
    }
}

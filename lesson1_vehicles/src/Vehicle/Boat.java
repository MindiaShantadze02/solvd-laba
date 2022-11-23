package vehicle;

import passenger.Passenger;

public class Boat extends Vehicle{
    private String boatType;
    private boolean isWooden;

    public Boat() {
        this.boatType = null;
        this.isWooden = false;
        this.type = "Sea Vehicle";
    }

    public Boat(String name, String model, int releaseYear, int maxPassengers, Passenger owner, String boatType, boolean isWooden) {
        super(name, model, releaseYear, maxPassengers, owner);
        this.boatType = boatType;
        this.isWooden = isWooden;
        this.type = "Sea Vehicle";
    }

    public void move() {
        System.out.println("Boat started swimming");
    }
}

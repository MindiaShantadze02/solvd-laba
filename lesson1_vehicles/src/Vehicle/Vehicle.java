package vehicle;

import java.lang.Math;
import passenger.Passenger;

public abstract class Vehicle {
    // initializing fields
    protected final String id = Integer.toString((int)(Math.random() * 10 * 10 * 10) * 1000);
    private String name;
    private String model;
    protected String type;
    private int releaseYear;
    private Passenger owner;
    private int maxPassengers;
    public Vehicle() {
        this.name = null;
        this.model = null;
        this.type = null;
        this.releaseYear = 0;
        this.maxPassengers = 0;
        this.owner = null;
    }

    public Vehicle(String name, String model, int releaseYear, int maxPassengers, Passenger owner) {
        this.name = name;
        this.model = model;
        this.releaseYear = releaseYear;
        this.maxPassengers = maxPassengers;
        this.owner = owner;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getType(){
        return this.type;
    };

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public abstract void move();

    public void printVehicleInfo() {
        System.out.println("Name: " + this.getName());
        System.out.println("Model: " + this.getModel());
        System.out.println("Type: " + this.getType());
    }
}

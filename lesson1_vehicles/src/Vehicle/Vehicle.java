package Vehicle;

import java.lang.Math;

public abstract class Vehicle {
    // initializing fields
    protected final String id = Integer.toString((int)(Math.random() * 10 * 10 * 10) * 1000);
    private String name;
    private String model;
    protected String type;
    private int releaseYear;
    private int traveledDistance;
    private double travelTime;
    private int maxPassengers;
    private int avgSpeed;

    public Vehicle() {
        this.name = null;
        this.model = null;
        this.type = null;
        this.releaseYear = 0;
        this.traveledDistance = 0;
        this.maxPassengers = 0;
        this.avgSpeed = 0;
        this.travelTime = 0;
    }

    public Vehicle(String name, String model, int releaseYear, int maxPassengers, int avgSpeed) {
        this.name = name;
        this.model = model;
        this.releaseYear = releaseYear;
        this.maxPassengers = maxPassengers;
        this.avgSpeed = avgSpeed;
    }

    // data getters
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

    public int getTraveledDistance() {
        return traveledDistance;
    }

    public String getType(){
        return this.type;
    };

    // data setters
    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setTraveledDistance(int traveledDistance) {
        this.traveledDistance = traveledDistance;
    }

    public Vehicle travel (double distance){
        this.travelTime = distance/this.avgSpeed;

        System.out.println("You are about to travel " + distance + "kilometers");
        System.out.println("Traveling will take about " + travelTime + "hours");

        this.traveledDistance += distance;

        return this;
    }

    public void printVehicleInfo() {
        System.out.println("Name: " + this.getName());
        System.out.println("Model: " + this.getModel());
        System.out.println("Type: " + this.getType());
    }
}

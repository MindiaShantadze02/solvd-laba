package vehicle;

import java.lang.Math;

import exceptions.AgeException;
import exceptions.InvalidDriverLicenseException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import passenger.Passenger;

public abstract class Vehicle {
    // initializing fields
    private static final Logger LOGGER = LogManager.getLogger(Vehicle.class);
    protected final String id = Integer.toString((int)(Math.random() * 10 * 10 * 10) * 1000);
    private String name;
    private String model;
    protected String type;
    private int releaseYear;
    private Passenger driver;
    private int maxPassengers;
    public Vehicle() {
        this.name = null;
        this.model = null;
        this.releaseYear = 0;
        this.maxPassengers = 0;
        this.driver = null;
    }

    public Vehicle(String name, String model, int releaseYear, int maxPassengers) {
        this.name = name;
        this.model = model;
        this.releaseYear = releaseYear;
        this.maxPassengers = maxPassengers;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }


    public Passenger getDriver() {
        return driver;
    }

    public void setDriver(Passenger driver) {
        this.driver = driver;
    }

    public abstract void move(Passenger driver) throws AgeException, InvalidDriverLicenseException;

    public void printVehicleInfo() {
        LOGGER.info("Name: " + this.getName());
        LOGGER.info("Model: " + this.getModel());
    }
}

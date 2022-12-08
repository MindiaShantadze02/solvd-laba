package vehicle_theme.vehicle;

import java.lang.Math;
import java.util.HashMap;

import exceptions.AgeException;
import exceptions.InvalidDriverLicenseException;
import exceptions.InvalidPassengerCountException;
import exceptions.InvalidSeatException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import vehicle_theme.passenger.Passenger;

public abstract class Vehicle {
    // initializing fields
    private static final Logger LOGGER = LogManager.getLogger(Vehicle.class);
    protected final String id = Integer.toString((int)(Math.random() * 10 * 10 * 10) * 1000);
    private HashMap<Integer, Passenger> passengers;
    private String name;
    private String model;
    protected String type;
    private int releaseYear;
    private Passenger driver;
    private int passengerCount = 0;
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

    public void addPassenger(Integer seatNumber, Passenger passenger) throws InvalidPassengerCountException, InvalidSeatException {
        try {
            if (seatNumber == 1) {
                throw new InvalidSeatException("Seat 1 is only for driver.");
            } else if (seatNumber > this.maxPassengers) {
                throw new InvalidSeatException("Invalid seat number.");
            } else if (passengers.containsKey(seatNumber)) {
                throw new InvalidSeatException("Seat is already taken.");
            }

            if (this.passengerCount > this.maxPassengers) {
                throw new InvalidPassengerCountException("Passenger count exceed the limit of passengers. Max number is: " + this.maxPassengers);
            }

            passengers.put(seatNumber, passenger);
        } catch(InvalidPassengerCountException e) {
            LOGGER.error(e.getMessage());
        } catch(InvalidSeatException e) {
            LOGGER.error(e.getMessage());
        }
    }

    public void printVehicleInfo() {
        LOGGER.info("Name: " + this.getName());
        LOGGER.info("Model: " + this.getModel());
    }
}

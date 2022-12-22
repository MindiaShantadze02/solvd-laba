package vehicle_theme.garage;

import enums.VehicleType;
import exceptions.InvalidVehicleCountException;
import exceptions.VehicleNotFoundException;
import interfaces.IGarage;
import interfaces.ISearchVehicle;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import vehicle_theme.vehicle.Vehicle;

import java.util.ArrayList;

public class Garage implements IGarage {
    public Garage(int capacity) {
        this.capacity = capacity;
    }

    private static final Logger LOGGER = LogManager.getLogger(Garage.class);
    private int capacity;
    private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

    @Override
    public void addVehicle(Vehicle vehicle) throws InvalidVehicleCountException {
        try {
            vehicles.add(vehicle);

            if (vehicles.size() > this.capacity) {
                throw new InvalidVehicleCountException("Vehicle count is more than capacity");
            }
        } catch(InvalidVehicleCountException e) {
            LOGGER.error(e.getMessage());
        }
    }

    @Override
    public void removeVehicle(String vehicleName) throws VehicleNotFoundException {
        try {
            for (Vehicle vehicle: vehicles) {
                if (vehicle.getName() == vehicleName) {
                    vehicles.remove(vehicle);
                    return;
                }
            }

            throw new VehicleNotFoundException("Vehicle with name " + vehicleName + " couldn't be found");
        } catch (VehicleNotFoundException e) {
            LOGGER.error(e.getMessage());
        }
    }

    public void getVehicleType(String vehicleName) throws Exception {
        try {
            VehicleType vehicleType = null;
            for (Vehicle vehicle : vehicles) {
                if (vehicle.getName() == vehicleName) {
                    vehicleType = vehicle.getType();
                }
            }

            switch(vehicleType) {
                case GROUND_VEHICLE:
                    LOGGER.info("Ground Type");
                    break;
                case SEA_VEHICLE:
                    LOGGER.info("Sea Type");
                    break;
                case SKY_VEHICLE:
                    LOGGER.info("Flying type");
                    break;
                default:
                    throw new Exception("Vehicle not found");
            }
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
        }
    }

    public void searchVehicles(ISearchVehicle<Vehicle> query) {
        try {
            int vCount = 0;

            for (Vehicle vehicle : this.vehicles) {
                if (query.search(vehicle)) {
                    System.out.println(vehicle.getName());
                    vCount++;
                }
            }

            if (vCount == 0) throw new VehicleNotFoundException("No search results");
        } catch (VehicleNotFoundException e) {
            LOGGER.error(e.getMessage());
        }

    }

    public void printVehicles() {
        if (this.vehicles.size() > 0) {
            for (Vehicle vehicle : this.vehicles) {
                System.out.println(vehicle.getName());
            }
        }
    }
}

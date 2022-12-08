package vehicle_theme.garage;

import exceptions.InvalidVehicleCountException;
import exceptions.VehicleNotFoundException;
import interfaces.IGarage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import vehicle_theme.vehicle.Vehicle;

import java.util.ArrayList;

public class Garage implements IGarage {
    private static final Logger LOGGER = LogManager.getLogger(Garage.class);
    private int capacity;
    private ArrayList<Vehicle> vehicles;

    @Override
    public void addVehicle(Vehicle vehicle) throws InvalidVehicleCountException {
        try {
            if (vehicles.size() > this.capacity) {
                throw new InvalidVehicleCountException("Vehicle count is more than capacity");
            }

            vehicles.add(vehicle);
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
}

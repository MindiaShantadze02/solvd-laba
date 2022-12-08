package interfaces;

import exceptions.InvalidVehicleCountException;
import vehicle_theme.vehicle.Vehicle;

public interface IGarage {
    public void addVehicle(Vehicle vehicle) throws InvalidVehicleCountException;
    public void removeVehicle(String vehicleName);
}

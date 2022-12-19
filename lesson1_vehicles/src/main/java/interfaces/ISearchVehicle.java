package interfaces;

import vehicle_theme.vehicle.Vehicle;

@FunctionalInterface
public interface ISearchVehicle <T extends Vehicle> {
    public boolean search(T vehicle);
}

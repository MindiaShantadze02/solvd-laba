import enums.VehicleType;
import exceptions.AgeException;
import exceptions.InvalidVehicleCountException;
import vehicle_theme.garage.Garage;
import vehicle_theme.passenger.DriverLicense;
import vehicle_theme.passenger.Passenger;
import vehicle_theme.vehicle.Bicycle;
import vehicle_theme.vehicle.Car;
import vehicle_theme.vehicle.Plane;

public class Main {
    public static void main(String[] args) throws Exception {
        DriverLicense driverLicense = new DriverLicense("12345678910", "Ground Vehicle", 2020, 2040);
        Passenger driver = new Passenger("12345678910" ,"Mindia", "Shantadze", 20, 595024140, driverLicense);

        Bicycle newBicycle = new Bicycle("BMX", "b-model-2134", 2000, 2, 21);
        Car newCar = new Car("Mercedes", "SLS", 2012, 2, 4, 50, 2);
        Plane newPlane = new Plane("Boeing", "Model", 2020, 15);

        Garage newGarage = new Garage(5);
        newGarage.addVehicle(newBicycle);
        newGarage.addVehicle(newCar);
        newGarage.addVehicle(newPlane);

        newGarage.getVehicleType("BMX");
        newGarage.searchVehicles(vehicle -> {
            return (vehicle.getType() == VehicleType.SKY_VEHICLE);
        });
    }
}
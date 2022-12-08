import exceptions.AgeException;
import vehicle_theme.passenger.DriverLicense;
import vehicle_theme.passenger.Passenger;
import vehicle_theme.vehicle.Bicycle;
import vehicle_theme.vehicle.Car;

public class Main {
    public static void main(String[] args) throws AgeException {
        DriverLicense driverLicense = new DriverLicense("12345678910", "Ground Vehicle", 2020, 2040);
        Passenger driver = new Passenger("12345678910" ,"Mindia", "Shantadze", 20, 595024140, driverLicense);

        Bicycle newBicycle = new Bicycle("BMX", "b-model-2134", 2000, 2, 21);
        Car newCar = new Car("Mercedes", "SLS", 2012, 2, 4, 50, 2);

        newBicycle.move(driver);
        newCar.move(driver);
    }
}
import passenger.DriverLicense;
import passenger.Passenger;
import vehicle.Boat;
import vehicle.Bicycle;
import vehicle.Car;
import vehicle.Plane;

public class Main {
    public static void main(String[] args) {
        DriverLicense driverLicense = new DriverLicense("12345678910", "C", 2020, 2035);
        Passenger driver = new Passenger("12345678910", "Mindia", "Shantadze", 19, 599002211, driverLicense);

        Car newCar = new Car("Audi", "some-model-92", 2002, 4, driver, 4, 100, 4);

    }
}
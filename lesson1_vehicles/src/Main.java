import travel.TravelPath;
import vehicle.Boat;
import vehicle.Bycicle;
import vehicle.Car;
import vehicle.Plane;

public class Main {
    public static void main(String[] args) {
        TravelPath newTravelPath = new TravelPath("Tbilisi", "Batumi", 300);

        Car newCar = new Car("Ford", "Mustang", 2005, 4, 120, 4, 100, 4);
        newCar.printVehicleInfo();

        Plane newPlane = new Plane("Boeing", "335-random", 2022, 10, 500, 10000);
        newTravelPath.travel(newPlane);

        Bycicle newBicycle = new Bycicle("BMX", "new", 2020, 1, 15, 23);
        newTravelPath.travel(newBicycle);

        Boat newBoat = new Boat("Titanic", "something-55", 1990, 500, 90, "Ship", false);
        newTravelPath.travel(newBoat);
        newTravelPath.travel(newBoat);

        newBoat.printVehicleInfo();
    }
}
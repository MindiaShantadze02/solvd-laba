import Vehicle.Boat;
import Vehicle.Bycicle;
import Vehicle.Car;
import Vehicle.Plane;

public class Main {
    public static void main(String[] args) {
        Car newCar = new Car("Ford", "Mustang", 2005, 4, 120, 4, 100, 4);
        newCar.travel(500);

        Plane newPlane = new Plane("Boeing", "335-random", 2022, 10, 500, 10000);
        newPlane.travel(500);

        Bycicle newBicycle = new Bycicle("BMX", "new", 2020, 1, 15, 23);
        newBicycle.travel(500);

        Boat newBoat = new Boat("Titanic", "something-55", 1990, 500, 90, "Ship", false);
        newBoat.travel(500);
    }
}
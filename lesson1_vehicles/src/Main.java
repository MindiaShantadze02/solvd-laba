import Vehicle.Car;

public class Main {
    public static void main(String[] args) {
        Car newCar = new Car("Volvo", "Model", 2000, 200, 4, 200, 4, 20);
        newCar.travel(500).travel(1000).travel(2000);

        newCar.printVehicleInfo();
    }
}
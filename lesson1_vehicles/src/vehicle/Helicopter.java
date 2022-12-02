package vehicle;

import interfaces.Flyable;
import passenger.Passenger;

public class Helicopter extends Vehicle implements Flyable {
    public void move(Passenger driver) {
        System.out.println("started moving");
    }

    public void fly() {
        System.out.println("Helicopter is flying");
    }

    public void land() {
        System.out.println("Helicopter is landing on H sign");
    }
}

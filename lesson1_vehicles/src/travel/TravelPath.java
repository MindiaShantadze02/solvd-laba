package travel;

import vehicle.Vehicle;

public class TravelPath {
    String startPoint;
    String endPoint;
    int distance;
    double travelTime = 0;

    public TravelPath(String startPoint, String endPoint, int distance) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.distance = distance;
    }

    public void travel(Vehicle vehicle) {
        vehicle.setTraveledDistance(vehicle.getTraveledDistance() + this.distance);
        vehicle.setTraveledTime(vehicle.getTraveledDistance()/vehicle.getAvgSpeed());

        System.out.println("Travelling from " + this.startPoint + " to " + this.endPoint + " took " + vehicle.getTraveledTime() + " hour.");
        System.out.println("Distance traveled by the vehicle is " + vehicle.getTraveledDistance());
    }
}

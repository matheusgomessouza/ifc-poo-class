package auto;

public class Vehicle {
    private double fuelCapacity;       // in liters
    private int distancePerLitre;      // km per liter
    private int traveledDistance;      // total km traveled

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getDistancePerLitre() {
        return distancePerLitre;
    }

    public void setDistancePerLitre(int distancePerLitre) {
        this.distancePerLitre = distancePerLitre;
    }

    public int getTraveledDistance() {
        return traveledDistance;
    }

    public void setTraveledDistance(int traveledDistance) {
        this.traveledDistance = traveledDistance;
    }

    // Method to simulate driving a certain distance
    public void drive(int distance) {
        int range = (int) (fuelCapacity * distancePerLitre);
        if (range <= 0) {
            System.out.println("Fuel tank is empty.");
        } else if (distance <= range) {
            traveledDistance += distance;
            fuelCapacity -= (double) distance / distancePerLitre;
            System.out.println("Vehicle drove " + distance + " km.");
        } else {
            traveledDistance += range;
            fuelCapacity = 0;
            System.out.println("Not enough fuel. Vehicle drove only " + range + " km.");
        }
    }

    // Method to show current range
    public void showRange() {
        int range = (int) (fuelCapacity * distancePerLitre);
        System.out.println("Current range: " + range + " km.");
    }

    // Method to show total distance traveled
    public void showTraveledDistance() {
        System.out.println("Total distance traveled: " + traveledDistance + " km.");
    }
}

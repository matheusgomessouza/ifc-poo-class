package auto;

public class Vehicle {
    private double fuelCapacity;
    private int distancePerLitre;
    private int traveledDistance;

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

    public void move(int distance) {
        if (this.fuelCapacity <= 0) {
            System.out.println("The fuel is empty");
        } else {
            // autonomy = distance / fuel
            // distance = fuel * autonomy
            this.traveledDistance += (int) this.fuelCapacity * this.distancePerLitre;
        }
    }

}

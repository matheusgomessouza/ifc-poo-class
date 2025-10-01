package auto;

public class Car extends Vehicle {
    private String model;

    public Car(String model, double fuelCapacity, int distancePerLitre) {
        this.model = model;
        setFuelCapacity(fuelCapacity);
        setDistancePerLitre(distancePerLitre);
        setTraveledDistance(0);
    }

    public String getModel() {
        return model;
    }

    public void showCarInfo() {
        System.out.println("Car model: " + model);
        showRange();
        showTraveledDistance();
    }
}

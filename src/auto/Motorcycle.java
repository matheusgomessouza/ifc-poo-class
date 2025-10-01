package auto;

public class Motorcycle extends Vehicle {
    private String brand;

    public Motorcycle(String brand, double fuelCapacity, int distancePerLitre) {
        this.brand = brand;
        setFuelCapacity(fuelCapacity);
        setDistancePerLitre(distancePerLitre);
        setTraveledDistance(0);
    }

    public String getBrand() {
        return brand;
    }

    public void showMotorcycleInfo() {
        System.out.println("Motorcycle  brand: " + brand);
        showRange();
        showTraveledDistance();
    }
}


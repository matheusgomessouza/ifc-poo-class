package patrimony.management;

public class Chair extends Furniture {
    private Boolean hasWheels;

    public Chair(Integer id, String name, String location, String brand, String color, Boolean hasWheels) {
        super(id, name, location, brand, color);
        this.hasWheels = hasWheels;
    }

    public Boolean getHasWheels() {
        return hasWheels;
    }

    public void setHasWheels(Boolean hasWheels) {
        this.hasWheels = hasWheels;
    }
}

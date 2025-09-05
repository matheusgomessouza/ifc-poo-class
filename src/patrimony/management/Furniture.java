package patrimony.management;

public class Furniture extends Patrimony {
    private String brand;
    private String color;

    public Furniture(Integer id, String name, String location, String brand, String color) {
        super(id, name, location);
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

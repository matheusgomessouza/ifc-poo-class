package patrimony.management;

public class Electronics extends Patrimony {
    private String brand;
    private String model;
    private String color;
    private String[] connections;

    public Electronics(Integer id, String name, String location, String brand, String model, String color, String[] connections) {
        super(id, name, location);
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.connections = connections;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String[] getConnections() {
        return connections;
    }

    public void setConnections(String[] connections) {
        this.connections = connections;
    }
}

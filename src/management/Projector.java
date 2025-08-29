package management;

public class Projector extends Eletronics{
    private Integer luminosity;
    private String[] resolution;

    public Projector(Integer id, String name, String location, String brand, String model, String color, String[] connections, Integer luminosity, String[] resolution) {
        super(id, name, location, brand, model, color, connections);
        this.luminosity = luminosity;
        this.resolution = resolution;
    }

    public Integer getLuminosity() {
        return luminosity;
    }

    public void setLuminosity(Integer luminosity) {
        this.luminosity = luminosity;
    }

    public String[] getResolution() {
        return resolution;
    }

    public void setResolution(String[] resolution) {
        this.resolution = resolution;
    }
}

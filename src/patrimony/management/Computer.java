package patrimony.management;

public class Computer extends Electronics {
    private String format;
    private String[] composition;
    private String type;
    private Peripherals[] peripherals;

    public Computer(Integer id, String name, String location, String brand, String model, String color, String[] connections, String format, String[] composition, String type, Peripherals peripherals) {
        super(id, name, location, brand, model, color, connections);
        this.format = format;
        this.composition = composition;
        this.type = type;
        this.peripherals = new Peripherals[]{peripherals};
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String[] getComposition() {
        return composition;
    }

    public void setComposition(String[] composition) {
        this.composition = composition;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Peripherals[] getPeripherals() {
        return peripherals;
    }

    public void setPeripherals(Peripherals[] peripherals) {
        this.peripherals = peripherals;
    }
}

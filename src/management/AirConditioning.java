package management;

public class AirConditioning extends Eletronics{
    private Integer voltage;
    private Integer britishThermalUnit;

    public AirConditioning(Integer id, String name, String location, String brand, String model, String color, String[] connections, Integer voltage, Integer britishThermalUnit) {
        super(id, name, location, brand, model, color, connections);
        this.voltage = voltage;
        this.britishThermalUnit = britishThermalUnit;
    }

    public Integer getVoltage() {
        return voltage;
    }

    public void setVoltage(Integer voltage) {
        this.voltage = voltage;
    }

    public Integer getBritishThermalUnit() {
        return britishThermalUnit;
    }

    public void setBritishThermalUnit(Integer britishThermalUnit) {
        this.britishThermalUnit = britishThermalUnit;
    }
}

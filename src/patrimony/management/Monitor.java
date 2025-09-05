package patrimony.management;

public class Monitor extends Peripherals {
    private String[] resolution;
    private Integer voltage;

    public Monitor(String[] resolution, Integer voltage, String functionality) {
        super(functionality);
        this.resolution = resolution;
        this.voltage = voltage;
    }

    public String[] getResolution() {
        return resolution;
    }

    public void setResolution(String[] resolution) {
        this.resolution = resolution;
    }

    public Integer getVoltage() {
        return voltage;
    }

    public void setVoltage(Integer voltage) {
        this.voltage = voltage;
    }
}

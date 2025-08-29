package management;

public class Monitor {
    private String[] resolution;
    private Integer voltage;

    public Monitor(String[] resolution, Integer voltage) {
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

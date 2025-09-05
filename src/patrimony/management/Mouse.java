package patrimony.management;

public class Mouse extends Peripherals {
    private Integer dpi;
    private String connectionType;

    public Mouse(Integer dpi, String connectionType, String functionality) {
        super(functionality);
        this.dpi = dpi;
        this.connectionType = connectionType;
    }

    public Integer getDpi() {
        return dpi;
    }

    public void setDpi(Integer dpi) {
        this.dpi = dpi;
    }

    public String getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }
}

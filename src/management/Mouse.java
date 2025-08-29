package management;

public class Mouse {
    private Integer dpi;
    private String connectionType;

    public Mouse(Integer dpi, String connectionType) {
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

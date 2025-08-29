package management;

public class Keyboard {
    private String pattern;
    private String connectionType;

    public Keyboard(String pattern, String connectionType) {
        this.pattern = pattern;
        this.connectionType = connectionType;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }
}

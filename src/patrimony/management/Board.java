package patrimony.management;

public class Board extends Furniture {
    private String type;
    private Integer width;
    private Integer height;

    public Board(Integer id, String name, String location, String brand, String color, String type, Integer width, Integer height) {
        super(id, name, location, brand, color);
        this.type = type;
        this.width = width;
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }
}

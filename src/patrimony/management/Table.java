package patrimony.management;

public class Table extends Furniture {
    private String format;
    private Integer legsQuantity;
    private String[] materials;

    public Table(Integer id, String name, String location, String brand, String color, String format, Integer legsQuantity, String[] materials) {
        super(id, name, location, brand, color);
        this.format = format;
        this.legsQuantity = legsQuantity;
        this.materials = materials;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Integer getLegsQuantity() {
        return legsQuantity;
    }

    public void setLegsQuantity(Integer legsQuantity) {
        this.legsQuantity = legsQuantity;
    }

    public String[] getMaterials() {
        return materials;
    }

    public void setMaterials(String[] materials) {
        this.materials = materials;
    }
}

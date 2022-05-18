package entity;
public class Product {
    private int sqlID;
    private long barcode;
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getBarcode() {
        return barcode;
    }
    public void setBarcode(String barcode) {
        this.barcode = Long.parseLong(barcode);
    }
}
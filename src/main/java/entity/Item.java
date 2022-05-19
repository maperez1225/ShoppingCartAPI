package entity;
public class Item {
    private int productID;
    private int amount;
    private int orderID;
    public Item(){}
    public Item(int productID, int amount, int orderID) {
        this.productID = productID;
        this.amount = amount;
        this.orderID = orderID;
    }
    public int getProductID() {
        return productID;
    }
    public void setProductID(int productID) {
        this.productID = productID;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public int getOrderID() {
        return orderID;
    }
    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }
}
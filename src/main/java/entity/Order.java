package entity;
public class Order {
    private int orderID;
    private long id;
    private boolean isPaid;
    private long orderDate;
    private long paymentDate;
    public Order(int orderID, long id, boolean isPaid, long orderDate, long paymentDate) {
        this.orderID = orderID;
        this.id = id;
        this.isPaid = isPaid;
        this.orderDate = orderDate;
        this.paymentDate = paymentDate;
    }
    public int getOrderID() {
        return orderID;
    }
    public long getId() {
        return id;
    }
    public boolean isPaid() {
        return isPaid;
    }
    public long getOrderDate() {
        return orderDate;
    }
    public long getPaymentDate() {
        return paymentDate;
    }
}
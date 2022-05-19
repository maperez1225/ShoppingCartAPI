package entity;
public class Order {
    private int orderID;
    private long id;
    private boolean isPaid;
    private long orderDate;
    private long paymentDate;
    public Order(){}
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
    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public boolean isPaid() {
        return isPaid;
    }
    public void setPaid(boolean paid) {
        isPaid = paid;
    }
    public long getOrderDate() {
        return orderDate;
    }
    public void setOrderDate(long orderDate) {
        this.orderDate = orderDate;
    }
    public long getPaymentDate() {
        return paymentDate;
    }
    public void setPaymentDate(long paymentDate) {
        this.paymentDate = paymentDate;
    }
}
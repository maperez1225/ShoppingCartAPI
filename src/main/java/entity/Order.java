package entity;
public class Order {
    private int orderID;
    private long customerID;
    private boolean isPaid;
    private Long orderDate;
    private Long paymentDate;
    public Order(){}
    public Order(int orderID, long customerID, boolean isPaid, long orderDate, long paymentDate) {
        this.orderID = orderID;
        this.customerID = customerID;
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
    public long getCustomerID() {
        return customerID;
    }
    public void setCustomerID(long customerID) {
        this.customerID = customerID;
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
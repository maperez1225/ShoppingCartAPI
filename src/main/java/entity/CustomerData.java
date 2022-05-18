package entity;
import java.util.ArrayList;
public class CustomerData {
    private long id;
    private ArrayList<Order> orders;
    public CustomerData(long id, ArrayList<Order> orders) {
        this.id = id;
        this.orders = orders;
    }
    public long getId() {
        return id;
    }
    public ArrayList<Order> getOrders() {
        return orders;
    }
}
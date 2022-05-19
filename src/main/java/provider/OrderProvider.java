package provider;
import db.DBConnection;
import entity.Item;
import entity.Order;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrderProvider {
    public void create(Order order) throws SQLException, ClassNotFoundException {
        DBConnection connection = new DBConnection();
        connection.runQuery("INSERT INTO A00370027orders(customerID, isPaid, orderDate, paymentDate) VALUE ('"+order.getCustomerID()+"','"+order.isPaid()+"','"+order.getOrderDate()+"','"+order.getPaymentDate()+"')");
        connection.close();
    }
    public void setPaid(int id) throws SQLException, ClassNotFoundException {
        DBConnection connection = new DBConnection();
        connection.runQuery("UPDATE A00370027orders SET isPaid = 'true', paymentDate = '"+System.currentTimeMillis()+"' WHERE id = '"+id+"'");
        connection.close();
    }
    public List<Item> orderInfo(int id) throws SQLException, ClassNotFoundException {
        DBConnection connection = new DBConnection();
        ResultSet results = connection.getData("SELECT * FROM A00370027products_orders WHERE id = '"+id+"'");
        List<Item> items = new ArrayList<>();
        while (results.next())
            items.add(new Item(results.getInt("productID"), results.getInt("amount"), id));
        connection.close();
        return items;
    }
}
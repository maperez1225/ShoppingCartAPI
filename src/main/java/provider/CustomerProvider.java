package provider;
import db.DBConnection;
import entity.Customer;
import entity.CustomerData;
import entity.Order;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
public class CustomerProvider {
    public CustomerData getData(long id) throws SQLException, ClassNotFoundException {
        DBConnection connection = new DBConnection();
        ResultSet results = connection.getData("SELECT * FROM A00370027orders WHERE customerID="+id);
        ArrayList<Order> orders = new ArrayList<>();
        while(results.next()) {
            int orderID = results.getInt("id");
            boolean isPaid = results.getBoolean("isPaid");
            long orderDate = results.getInt("orderDate");
            long paymentDate = results.getLong("paymentDate");
            orders.add(new Order(orderID, id, isPaid, orderDate, paymentDate));
        }
        connection.close();
        return new CustomerData(id, orders);
    }
    public void create(Customer customer) throws SQLException, ClassNotFoundException {
        DBConnection connection = new DBConnection();
        connection.runQuery("INSERT INTO A00370027customers(name, natID) VALUE ("+customer.getName()+","+customer.getNatID()+")");
        connection.close();
    }
}
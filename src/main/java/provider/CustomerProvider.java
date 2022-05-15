package provider;
import db.DBConnection;
import model.Customer;
import java.sql.ResultSet;
import java.sql.SQLException;
public class CustomerProvider {
    public Customer getCustomer(long id) throws SQLException, ClassNotFoundException {
        DBConnection connection = new DBConnection();
        ResultSet results = connection.getData("SELECT * FROM A00370027customers WHERE natID="+id);
        if (results.next()){
            long natID = results.getLong("natID");
            String name = results.getString("name");
            int sqlID = results.getInt("id");
            connection.close();
            return new Customer(natID,sqlID,name);
        }else {
            connection.close();
            return null;
        }
    }
    public void create(Customer customer) throws SQLException, ClassNotFoundException {
        DBConnection connection = new DBConnection();
        connection.runQuery("INSERT INTO A00370027customers(name, natID) VALUE ("+customer.getName()+","+customer.getNatID()+")");
        connection.close();
    }
}
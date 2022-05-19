package provider;
import db.DBConnection;
import entity.Item;

import java.sql.ResultSet;
import java.sql.SQLException;
public class ItemProvider {
    public void createItem(Item item) throws SQLException, ClassNotFoundException {
        DBConnection connection = new DBConnection();
        connection.runQuery("INSERT INTO A00370027products_orders(productID,amount,orderID) VALUES ('"+item.getProductID()+"','"+item.getAmount()+"','"+item.getOrderID()+"')");
        connection.close();
    }
    public Item deleteProduct(int productID, int amount, int orderID) throws SQLException, ClassNotFoundException {
        DBConnection connection = new DBConnection();
        String sql = "SELECT * FROM A00370027products_orders WHERE orderID = '"+orderID+"' AND productID = '"+productID+"'";
        ResultSet results = connection.getData(sql);
        results.next();
        int currentAmount = results.getInt("cantidad");
        currentAmount -= amount;
        Item item = null;
        if(currentAmount > 0) {
            sql = "UPDATE A00370027products_orders SET amount = '" + currentAmount + "' WHERE orderID = '" + orderID + "' AND productID = '" + productID + "'";
            item = new Item(productID,currentAmount,orderID);
        }else
            sql = "DELETE FROM A00370027products_orders WHERE orderID = '" + orderID + "' AND productID = '" + productID + "'";
        connection.runQuery(sql);
        connection.close();
        return item;
    }
}
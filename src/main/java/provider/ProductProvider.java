package provider;
import db.DBConnection;
import entity.Product;
import java.sql.SQLException;
public class ProductProvider {
    public void create(Product product) throws SQLException, ClassNotFoundException {
        DBConnection connection = new DBConnection();
        connection.runQuery("INSERT INTO A00370027products(name, barcode) VALUE ("+product.getName()+","+product.getBarcode()+")");
        connection.close();
    }
}
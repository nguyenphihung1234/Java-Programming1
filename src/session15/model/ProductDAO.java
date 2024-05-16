package session15.model;

import session15.entity.Product;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ProductDAO {
    static void deleteEntity(Product entityId) {

    }

    public void createProduct(Product product) throws SQLException;
    public  Product getProductById (int prodId) throws SQLException;

    void createProduct() throws SQLException;

    public ArrayList<Product> getAllProducts() throws SQLException;
    public  void updateProduct(Product product) throws SQLException;
    public boolean deleteProduct(int product) throws SQLException;



}

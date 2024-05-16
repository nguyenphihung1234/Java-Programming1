package session15.model;

import session15.dao.MySQLConnectDB;
import session15.entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductDAOImpl implements ProductDAO {
    private final Connection connection = MySQLConnectDB.getMySqlConnection();
    private final String SQL_CREATE_PRODUCT = "INSERT INTO products VALUES (?, ?, ?, ?)";
    private final String SQL_GET_PRODUCT_BY_ID = "SELECT * FROM products WHERE product_id = ?";
    private final String SQL_GET_ALL_PRODUCTS = "SELECT * FROM products";
    private final String SQL_UPDATE_PRODUCT = "UPDATE products SET product_name = ?, description = ?, price = ? WHERE product_id = ?";
    private final String SQL_DELETE_PRODUCT = "DELETE FROM products WHERE product_id = ?";

    public ProductDAOImpl() throws SQLException {}

    @Override
    public void createProduct(Product product) throws SQLException {
        PreparedStatement pstm = connection.prepareStatement(SQL_CREATE_PRODUCT);
        pstm.setInt(1, product.getId());
        pstm.setString(2, product.getName());
        pstm.setString(3, product.getDescription());
        pstm.setDouble(4, product.getPrice());
        pstm.executeUpdate();
        System.out.println("Insert success");
    }

    @Override
    public ArrayList<Product> getAllProducts() throws SQLException {
        ArrayList<Product> allProducts = new ArrayList<>();
        PreparedStatement pstm = connection.prepareStatement(SQL_GET_ALL_PRODUCTS);
        ResultSet rs = pstm.executeQuery();
        while (rs.next()) {
            int productId = rs.getInt("product_id");
            String name = rs.getString("product_name");
            String description = rs.getString("description");
            double price = rs.getDouble("price");
            Product product = new Product(productId, name, description, price);
            allProducts.add(product);
        }
        return allProducts;
    }

    @Override
    public Product getProductById(int prodId) {
        try {
            PreparedStatement pstm = connection.prepareStatement(SQL_GET_PRODUCT_BY_ID);
            pstm.setInt(1, prodId);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                int productId = rs.getInt("product_id");
                String name = rs.getString("product_name");
                String description = rs.getString("description");
                double price = rs.getDouble("price");
                return new Product(productId, name, description, price);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void createProduct() throws SQLException {

    }

    @Override
    public void updateProduct(Product product) throws SQLException {
        PreparedStatement pstm = connection.prepareStatement(SQL_UPDATE_PRODUCT);
        pstm.setString(1, product.getName());
        pstm.setString(2, product.getDescription());
        pstm.setDouble(3, product.getPrice());
        pstm.setInt(4, product.getId());
        pstm.executeUpdate();
        System.out.println("Update success");
    }


    @Override
    public boolean deleteProduct(int prodId) throws SQLException {
        PreparedStatement pstm = connection.prepareStatement(SQL_DELETE_PRODUCT);
        pstm.setInt(1, prodId);
        int deleted = pstm.executeUpdate();
        if (deleted == 0) {
            System.out.println("No rows deleted. Product with ID " + prodId + " not found.");
        } else {
            System.out.println("Product with ID " + prodId + " deleted successfully.");
        }
        return deleted > 0;
    }
}

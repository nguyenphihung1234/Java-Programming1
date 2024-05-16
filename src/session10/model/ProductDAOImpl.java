package session10.model;
import session10.dao.MySQLConnectDB;
import session10.entity.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



public class ProductDAOImpl implements ProductDAO{
    private final Connection connection = MySQLConnectDB.getMySqlConnection();
    private final String SQL_CREATE_PRODUCT = "insert into products values(?,?,?,?)";
    private  final String SQL_GET_PRODUCT_BY_ID = "select * from products where product_id =?";
    private  final  String SQL_GET_ALL_PRODUCTS =" select * from products ";
    private final String SQL_UPDATE_PRODUCT ="update products set product_name like ? where product_id =?";
    private final  String SQL_DELETE_PRODUCT ="delete from products where id =?";

    public ProductDAOImpl() throws SQLException {
    }

    @Override
    public void createProduct(Product product) throws SQLException {
        PreparedStatement pstm = connection.prepareStatement(SQL_CREATE_PRODUCT);
        pstm.setInt(1,product.getProductId());
        pstm.setString(2,product.getProductName());
        pstm.setString(3,product.getProductDesc());
        pstm.setDouble(4,product.getPrice());
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
            String productName = rs.getString("product_name");
            String productDesc = rs.getString("description");
            double price = rs.getDouble("price");
            Product product = new Product(productId, productName, productDesc, price);
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
                String productName = rs.getString("product_name");
                String productDesc = rs.getString("description");
                double price = rs.getDouble("price");
                return new Product(productId, productName, productDesc, price);
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Xử lý ngoại lệ một cách phù hợp
        }
        return null;
    }



    @Override
    public void updateProduct(Product product) {
        try {
            PreparedStatement pstm = connection.prepareStatement(SQL_UPDATE_PRODUCT);
            pstm.setInt(1,product.getProductId());
            pstm.setString(2,product.getProductName());
            pstm.executeUpdate();
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public boolean deleteProduct(int prodId) {
        try {
            PreparedStatement pstm = connection.prepareStatement(SQL_DELETE_PRODUCT);
            pstm.setInt(1, prodId);
            int deleted = pstm.executeUpdate();
            if (deleted == 0) {
                System.out.println("No rows deleted. Person with ID " + prodId + " not found.");
            } else {
                System.out.println("Person with ID " + prodId + " deleted successfully.");
            }
            pstm.close();
        } catch (SQLException ex ) {
            ex.printStackTrace();
        }
        return false;
    }

}
package session10.controller;

import session10.entity.Product;
import session10.model.ProductDAOImpl;

import java.sql.SQLException;
import java.util.ArrayList;

public class ProductController {
    ProductDAOImpl productDAO = new ProductDAOImpl();
    public ProductController() throws SQLException{

    }
    public ArrayList<Product> getAllProDuctController() throws SQLException{
        //call model
        return productDAO.getAllProducts();
    }
    public void createProductController(Product product) throws SQLException {
     productDAO.createProduct(product);
    }
}
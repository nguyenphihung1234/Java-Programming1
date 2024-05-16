package session15.controller;

import session15.entity.Entity;
import session15.model.Model;
import session15.model.ProductDAO;
import session15.model.ProductDAOImpl;
import session15.entity.Product;

import java.sql.SQLException;
import java.util.List;

public class Controller<T extends Entity<?>> {
    private Model<T> model;
    private ProductDAOImpl productDAO;

    public Controller(ProductDAOImpl productDAO) throws SQLException {
        this.productDAO = productDAO;
    }

    public void createEntityController(T entity) throws SQLException {
        productDAO.createProduct((Product) entity);
    }

    public List<T> getAllEntityController() throws SQLException {
        return (List<T>) productDAO.getAllProducts();
    }
    public void updateEntityController(T entity) throws SQLException{
        productDAO.updateProduct((Product) entity);
    }
    public void deleteEntityController(int productId) throws SQLException {
        productDAO.deleteProduct(productId);
    }

}

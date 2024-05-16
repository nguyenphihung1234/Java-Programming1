package session15;

import session15.ui.ProductView;
import session15.controller.Controller;
import session15.entity.Customer;
import session15.entity.Product;
import session15.model.Model;

import java.sql.SQLException;
import java.util.List;

public class ApplicationClient {
    public static void main(String[] args) throws SQLException {
        //Create model

        ProductView productView = new ProductView();
        productView.start();




    }
}

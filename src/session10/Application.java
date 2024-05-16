package session10;

import session10.ui.ProductConsoleUI;

import java.sql.SQLException;

public class Application {
    public static void main(String[] args) throws SQLException {
        ProductConsoleUI pc = new ProductConsoleUI();
        pc.start();
    }
}
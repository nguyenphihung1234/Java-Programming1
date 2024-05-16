package session15.ui;

import session15.controller.Controller;
import session15.entity.Product;
import session15.model.ProductDAOImpl;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class ProductView {
    private final Scanner sc;
    private final Controller<Product> controller;

    public ProductView() throws SQLException {
        this.sc = new Scanner(System.in);
        ProductDAOImpl productDAO = new ProductDAOImpl();
        this.controller = new Controller<>(productDAO);
    }

    public int menu() {
        System.out.println("=== Product Management ===");
        System.out.println("1. Show all products");
        System.out.println("2. Create");
        System.out.println("3. Update");
        System.out.println("4. Delete");
        System.out.println("5. Find by ID");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
        int choice = Integer.parseInt(sc.nextLine());
        return choice;
    }

    public void getAllProductUI() throws SQLException {
        List<Product> allProducts = controller.getAllEntityController();
        allProducts.forEach(product -> {
            System.out.println("=== Product Details ===");
            System.out.println("ID: " + product.getId());
            System.out.println("Name: " + product.getName());
            System.out.println("Description: " + product.getDescription());
            System.out.println("Price: " + product.getPrice());
        });
    }

    public void createProduct() throws SQLException {
        System.out.print("Enter ID: ");
        int product_id = Integer.parseInt(sc.nextLine());
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Description: ");
        String desc_product = sc.nextLine();
        System.out.print("Price: ");
        double price = Double.parseDouble(sc.nextLine());
        Product product = new Product(product_id, name, desc_product, price);
        controller.createEntityController(product);
        System.out.println("Product has been added to the list.");
    }

    public void updateProduct() throws SQLException {
        System.out.print("Enter the ID of the product to update: ");
        int product_id = Integer.parseInt(sc.nextLine());
        System.out.print("Enter new name: ");
        String name = sc.nextLine();
        System.out.print("Enter new description: ");
        String desc_product = sc.nextLine();
        System.out.print("Enter new price: ");
        double price = Double.parseDouble(sc.nextLine());
        Product product = new Product(product_id, name, desc_product, price);
        controller.updateEntityController(product);
        System.out.println("Product has been updated.");
    }
    public void deleteProduct() throws SQLException {
        System.out.print("Enter the ID of the product to delete: ");
        int productId = Integer.parseInt(sc.nextLine());
        controller.deleteEntityController(productId); // Pass the product ID here
        System.out.println("Product has been deleted.");
    }


    public void start() throws SQLException {
        while (true) {
            int choice = menu();
            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    getAllProductUI();
                    break;
                case 2:
                    createProduct();
                    break;
                case 3:
                    updateProduct();
                    break;
                case 4:
                    deleteProduct();
                    break;
                // Implement other cases as needed
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

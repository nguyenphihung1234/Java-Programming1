package session10.ui;

import session10.controller.ProductController;
import session10.entity.Product;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductConsoleUI {
    private final Scanner sc;
    ProductController productController = new ProductController();
    public ProductConsoleUI() throws SQLException{
        this.sc = new Scanner(System.in);
    }
    public int menu(){
        System.out.println("===Product Manegement===");
        System.out.println("1. Show all product");
        System.out.println("2. Create");
        System.out.println("3. Update");
        System.out.println("4. Delete");
        System.out.println("5. Find by id");
        System.out.println("0. Exit");
        int choice = Integer.parseInt(sc.nextLine());
        return choice;
    }

    public void getALLProductUI() throws SQLException{
        ArrayList<Product> allProducts = productController.getAllProDuctController();
        allProducts.forEach((product) ->{
            System.out.println("===Product Details===");
            System.out.println(product.getProductId());
            System.out.println(product.getProductName());
            System.out.println(product.getProductDesc());
            System.out.println(product.getPrice());
//            System.out.println(product.getProductId()+"\t"+product.getProductId());
//            System.out.println(product.getProductName()+"\t"+product.getProductName());
//            System.out.println(product.getProductDesc()+"\t"+product.getProductDesc());
//            System.out.println(product.getPrice());
        });
    }
    public void createProduct() throws SQLException {
        System.out.println("Enter id: ");
        int product_id= Integer.parseInt(sc.nextLine());
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Descripton: ");
        String desc_product = sc.nextLine();
        System.out.println("Price: ");
        double price = Double.parseDouble(String.valueOf(sc.nextDouble()));
        Product product = new Product(product_id,name,desc_product,price);
        productController.createProductController(product);
    }
    public void start() throws SQLException {
        while (true){
            int choice = menu();
            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1 :
                    getALLProductUI();
                    break;
                case 2 :
                    createProduct();
                    break;
            }
        }
    }
}
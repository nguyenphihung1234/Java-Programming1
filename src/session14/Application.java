package session14;

import session14.controller.Controller;
import session14.entity.Customer;
import session14.entity.Product;
import session14.model.Model;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws SQLException {
        Model<Customer> customerModel = new Model<>();
        Model<Product> productModel = new Model<>();
        //Create controller
        Controller<Customer> customerController = new Controller<>(customerModel);
        Controller<Product> productController = new Controller<>(productModel);

        // Thêm khách hàng mới
        Customer customer = new Customer(1);
        customer.setName("Gia Binh");
        customer.setAddress("Ha Noi");
        customer.setEmail("binh@gmail.com");
        customer.setPhone("123141234");
        customerController.addEntityController(customer);


        Product product = new Product(2);
        product.setName("Apple24");
        product.setDescription("The new product");
        product.setPrice(10000);
        productController.addEntityController(product);

        // Lấy danh sách khách hàng và sản phẩm
        List<Customer> customerList = customerController.getAllEntityController();
        List<Product> productList = productController.getAllEntityController();

        // Hiển thị danh sách khách hàng
        for (Customer c : customerList) {
            System.out.println("Customer: " + c.getName());
        }

        // Hiển thị danh sách sản phẩm
        for (Product p : productList) {
            System.out.println("Product: " + p.getName());
        }
        // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím3
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Hiển thị menu cho người dùng
            System.out.println("\nMenu:");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Xóa sản phẩm");
            System.out.println("3. Hiển thị danh sách sản phẩm");
            System.out.println("4. Thoát");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Thêm sản phẩm
                    System.out.println("\nNhập thông tin sản phẩm:");
                    System.out.print("ID: ");
                    int productId = scanner.nextInt();
                    scanner.nextLine(); // Đọc dòng trống
                    System.out.print("Tên: ");
                    String productName = scanner.nextLine();
                    System.out.print("Mô tả: ");
                    String productDescription = scanner.nextLine();
                    System.out.print("Giá: ");
                    double productPrice = scanner.nextDouble();

                    Product newProduct = new Product(productId);
                    newProduct.setName(productName);
                    newProduct.setDescription(productDescription);
                    newProduct.setPrice(productPrice);

                    productController.addEntityController(newProduct);
                    System.out.println("Sản phẩm đã được thêm vào danh sách.");
                    break;
                case 2:
                    // Xóa sản phẩm
                    System.out.println("\nNhập ID của sản phẩm cần xóa:");
                    int productIdToDelete = scanner.nextInt();
                    List<Product> productList1 = productController.getAllEntityController();
                    boolean found = false;
                    for (Product p : productList) {
                        if (p.getId() == productIdToDelete) {
                            productController.removeEntityController(p);
                            System.out.println("Đã xóa sản phẩm: " + p.getName());
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Không tìm thấy sản phẩm với ID " + productIdToDelete);
                    }
                    break;
                case 3:
                    // Hiển thị danh sách sản phẩm
                    List<Product> allProducts = productController.getAllEntityController();
                    System.out.println("\nDanh sách sản phẩm:");
                    for (Product p : allProducts) {
                        System.out.println(p.toString());
                    }
                    break;
                case 4:
                    // Thoát chương trình
                    System.out.println("Kết thúc chương trình.");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}



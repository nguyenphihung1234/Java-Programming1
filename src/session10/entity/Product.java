package session10.entity;

public class Product {
    private int productId ;
    private  String productName;
    private String productDesc;
    private Double price;

    public Product(int product_id, String name, String desc, double price) {
        this.productId = product_id;
        this.productName = name;
        this.productDesc = desc;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}

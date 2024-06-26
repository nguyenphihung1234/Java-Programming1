package session15.entity;

public class Product extends Entity<Integer> {
    private int productId ;
    private String name;
    private String description;
    private Double price;


    public Product(Integer id, String name, String description, Double price) {
        super(id);
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public Product(int productId) {
            super(productId);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}

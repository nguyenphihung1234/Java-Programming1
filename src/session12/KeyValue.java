package session12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class KeyValue<K,V> {
    private Map<K,V> map;

    public KeyValue() {
        this.map = new HashMap<>();
    }
    public void put(K key,V value) {
        map.put(key,value);
    }
    public V get(K key) {
        return map.get(key);
    }
    public Iterable<V> values() {
        return map.values();
    }
}
class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Id: " + id +",Name: " + name + ",Price: " + price;
    }
}
class Customer {
    private int id;
    private String name;
    private String email;

    public Customer(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "ID: " + id + ",Name: " + name + ",Email: "+email;
    }

    public static void main(String[] args) {
        KeyValue<Integer, Product> productMap = new KeyValue<>();
        productMap.put(1, new Product(1, "Apple 24", 1000));
        productMap.put(2, new Product(2, "Nokia 24", 300));
        productMap.put(3, new Product(3, "Samsung 24", 500));

        System.out.println("Product list: ");
        for (Product product : productMap.values()) {
            System.out.println(product.toString());
        }

        KeyValue<Integer, Customer> customerMap = new KeyValue<>();
        customerMap.put(1, new Customer(1, "Nam", "namfpt@gmail.com"));
        customerMap.put(2, new Customer(2, "Tung", "tungfpt@gmail.com"));
        customerMap.put(3, new Customer(3, "Thanh", "thanhfpt@gmail.com"));

        System.out.println("Customer list: ");
        for (Customer customer : customerMap.values()) {
            System.out.println(customer.toString());
        }
    }
}
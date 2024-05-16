package session14.model;

import session14.entity.*;

import java.util.ArrayList;
import java.util.List;

public class Model<T extends Entity<?>> {
    private List<T> entities = new ArrayList<>();
//    private List<Product> products =new ArrayList<>();
//    private List<Customer> customers = new ArrayList<>();
//    private List<Order> orders = new ArrayList<>();
//    private List<OrderDetail> orderDetails = new ArrayList<>();
    public void addEntity(T entity){
        entities.add(entity);
    }
    public List<T> getAllEntities(){
        return  entities;
    }

    public void removeEntity(T entity) {
        entities.remove(entity);
    }
}

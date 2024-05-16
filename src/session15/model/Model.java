package session15.model;

import  session15.entity.*;

import java.util.ArrayList;
import java.util.List;

public class Model<T extends Entity<?>> {
    private List<T> entities = new ArrayList<>();
//    private List<Pro  duct> products = new ArrayList<>();
//    private List<Customer> customers = new ArrayList<>();
//    private List<Order> orders = new ArrayList<>();
//    private List<OrderDetail> orderDetails = new ArrayList<>();
    public void createEntity(T entity){
        entities.add(entity);
    }
    public List<T> getAllEntities(){
        return entities;
    }
    public void deleteEntity(T entity) {
    }

    public void deleteEntity(int entityId) {
    }
}

package session10.dao;

import session10.entity.Order;

import java.util.List;

public class OrderManagement {
    private List<Order> orderList;
    public synchronized void createOrder(Order order){
           // them don hang moi vao day

    }
    public  synchronized void updateOrder(Order order){
     //Sua don hang .Chi 1 Thread dc goi taij thoi diem
    }
}

package session10.controller;

import session10.dao.OrderManagement;
import session10.entity.Order;
import session10.ui.OrderView;

public class OrderController {
    private OrderManagement orderManagement;
    OrderView orderView;
    public  synchronized  void  createOrderController(Order order){
        orderManagement.createOrder(order);
    }

    public  synchronized void updateOrderController(Order order){
        Order orderNewData = orderView.updateOrderDetail();
        orderManagement.updateOrder(order);
    }
}

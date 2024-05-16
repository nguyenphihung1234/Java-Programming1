package session15.entity;

import session15.entity.Entity;

import java.util.Date;

public class OrderDetail extends Entity<Integer> {
    private int orderId;
    private Date createAt;
    private Date updateAt;
    private int productId;
    private double price;
    private int quantity;


    public OrderDetail(Integer id) {
        super(id);
    }
}

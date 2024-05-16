package session14.entity;

import java.util.Date;
import java.util.List;

public class Order extends Entity<Integer>{
    private  int customerId;
    private Date createAt;

    private String paymentType;
    //1-N: Order-OrderDetail
    private List<OrderDetail> orderDetails;

    public Order(Integer id) {
        super(id);
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

}

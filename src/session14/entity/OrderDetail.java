package session14.entity;

import java.util.Date;

public class OrderDetail {
        private int orderId;
        private Date createAt;
        private Date updateAt;
        private int productId;
        private double price;
        private  int quantity;
        public OrderDetail(Integer id ){super();}

        public int getOrderId() {
                return orderId;
        }

        public void setOrderId(int orderId) {
                this.orderId = orderId;
        }

        public Date getCreateAt() {
                return createAt;
        }

        public void setCreateAt(Date createAt) {
                this.createAt = createAt;
        }

        public Date getUpdateAt() {
                return updateAt;
        }

        public void setUpdateAt(Date updateAt) {
                this.updateAt = updateAt;
        }

        public int getProductId() {
                return productId;
        }

        public void setProductId(int productId) {
                this.productId = productId;
        }

        public double getPrice() {
                return price;
        }

        public void setPrice(double price) {
                this.price = price;
        }

        public int getQuantity() {
                return quantity;
        }

        public void setQuantity(int quantity) {
                this.quantity = quantity;
        }
}

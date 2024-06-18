package chap5.helloshop.order;

import chap5.helloshop.product.Product;
import chap5.helloshop.user.User;


public class OrderService {
    public void order() {
        User user = new User();
        Product product = new Product();
        Order order = new Order(user,product);
    }
}

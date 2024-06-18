package chap5.helloshop.order;

import chap5.helloshop.product.Product;
import chap5.helloshop.user.User;

public class Order {

    User user;
    Product product;

    public Order(User user, Product product) {
        this.user =user;
        this.product = product;
    }
}

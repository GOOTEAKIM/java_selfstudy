package ex_problem.chap2;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int n = input.nextInt();
        input.nextLine();

        ProductOrder[] orders = new ProductOrder[n];

        for (int i = 0; i < orders.length; i++) {
            System.out.println((i+1) + "번째 주문 정보를 입력하세요.");

            System.out.print("상품명 : ");
            String productName = input.nextLine();

            System.out.print("가격: ");
            int price = input.nextInt();

            System.out.print("수량: ");
            int quantity = input.nextInt();

            input.nextLine();

            orders[i] = createOrder(productName, price, quantity);
        }

        printOrders(orders);

        int totalAmount = getTotalAmount(orders);

        System.out.println("총 가격: " + totalAmount);
    }

    public static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order1 = new ProductOrder();
        order1.productName = productName;
        order1.price = price;
        order1.quantity = quantity;

        return order1;
    }

    public static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + " 가격: " + order.price + " 수량: " + order.quantity);

        }
    }

    public static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += (order.price * order.quantity);
        }

        return totalAmount;
    }
}

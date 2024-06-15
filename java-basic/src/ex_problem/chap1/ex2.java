package ex_problem.chap1;

public class ex2 {
    public static void main(String[] args) {
        ProductOrder[] lists = new ProductOrder[3];

        ProductOrder doobu = new ProductOrder();
        doobu.productName = "두부";
        doobu.price = 2000;
        doobu.quantity = 2;

        ProductOrder kimchi = new ProductOrder();
        kimchi.productName = "김치";
        kimchi.price = 5000;
        kimchi.quantity = 1;

        ProductOrder cola = new ProductOrder();
        cola.productName = "콜라";
        cola.price = 1500;
        cola.quantity = 2;

        lists[0] = doobu;
        lists[1] = kimchi;
        lists[2] = cola;

        int totalAmount = 0;

        for (ProductOrder i : lists) {
            System.out.println("상품명 : " + i.productName +
                    ", 가격: " + i.price +
                    ", 수량: " + i.quantity);

            totalAmount += i.price * i.quantity;
        }

        System.out.println("총 결제 금액: " + totalAmount);

    }
}

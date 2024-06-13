package exproblem.chap7;

import java.util.Scanner;

public class ex7_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");

            int order = input.nextInt();

            if (order == 1) {
                System.out.print("상품명을 입력하세요: ");
                String name = input.next();

                System.out.print("구매 가격을 입력하세요: ");
                int price = input.nextInt();

                System.out.print("구매 수량을 입력하세요: ");
                int quantity = input.nextInt();

                sum += (price*quantity);

                System.out.println("상품명: " + name + " 가격: " + price + " 수량: " + quantity + " 합계: " + sum);
            } else if (order == 2) {
                System.out.println("총 비용 : " +sum);
            } else if (order == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 옵션을 선택해주세요.");
            }
        }

    }
}

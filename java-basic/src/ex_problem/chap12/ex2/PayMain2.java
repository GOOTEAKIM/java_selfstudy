package ex_problem.chap12.ex2;

import java.util.Scanner;

public class PayMain2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        PayService payService = new PayService();

        while (true) {
            System.out.println("결제 수단을 입력하세요.");
            String payOption = input.nextLine();

            if (payOption.equals("exit")) {
                System.out.println("프로그램 종료");
                return;
            }

            System.out.print("결제 금액을 입력하세요");
            int amount = input.nextInt();
            input.nextLine();

            payService.processPay(payOption, amount);
        }

    }

}

package chap7;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int sum = 0;

        while (true) {

            System.out.print("정수를 입력하세요 (0을 입력하면 종료) : ");
            int number = input.nextInt();

            if (number == 0) {
                break;
            }

            sum += number;
        }

        System.out.println("총 합은 : " + sum);
    }
}

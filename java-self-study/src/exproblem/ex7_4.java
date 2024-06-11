package exproblem;

import java.util.Scanner;

public class ex7_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("구구단의 단 수를 입력해주세요: ");
        int num1 = input.nextInt();

        System.out.println(num1 + "단의 구구단: ");

        for (int num2 = 1; num2 <= 9 ; num2++) {
            System.out.println(num1 +  " x " + num2 + " = " + num1 * num2);
        }

    }
}

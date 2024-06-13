package exproblem.chap7;

import java.util.Scanner;

public class ex7_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int i = 0;

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요:");

        while (true) {
            i = input.nextInt();

            if (i == -1) {
                break;
            }
            sum += i;
            count++;
        }

        double average = (double) sum / count;
        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + average);


    }
}

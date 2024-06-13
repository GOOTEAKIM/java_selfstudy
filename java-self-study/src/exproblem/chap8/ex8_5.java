package exproblem.chap8;

import java.util.Scanner;

public class ex8_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("입력받을 숫자의 개수를 입력하세요: ");
        int length = input.nextInt();

        int [] arr = new int[length];

        System.out.println(length + "개의 정수를 입력하세요:");

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
            sum += arr[i];
        }

        double average = (double) sum / arr.length;

        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + average);

    }
}

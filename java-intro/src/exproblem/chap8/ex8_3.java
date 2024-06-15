package exproblem.chap8;

import java.util.Scanner;

public class ex8_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("5개의 정수를 입력하세요 : ");

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("입력한 정수를 역순으로 출력");

        for (int i = arr.length-1; i >=0; i--) {
            System.out.print(arr[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
    }
}

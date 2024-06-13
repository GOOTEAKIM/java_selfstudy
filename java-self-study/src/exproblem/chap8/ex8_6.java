package exproblem.chap8;

import java.util.Scanner;

public class ex8_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("입력받을 숫자의 개수를 입력하세요: ");
        int leng = input.nextInt();

        System.out.println(leng + "개의 정수를 입력하세요: ");

        int [] arr = new int[leng];

        int min_num = 1000000;
        int max_num = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();

            if (arr[i] <= min_num) {
                min_num = arr[i];
            }

            if (arr[i] >= max_num) {
                max_num = arr[i];
            }
        }

        System.out.println("가장 작은 정수: " + min_num);
        System.out.println("가장 큰 정수: " + max_num);

    }
}

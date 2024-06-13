package exproblem.chap8;

import java.util.Scanner;

public class ex8_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("학생수를 입력하세요: ");
        int leng = input.nextInt();

        int [][] arr = new int[leng][3];

        String [] subjects = {"국어", "영어", "수학"};

        for (int i = 0; i < leng; i++) {
            System.out.println((i+1) + "번 학생의 성적을 입력하세요:");
            for (int j = 0; j < 3; j++) {
                System.out.print(subjects[j] + " 점수:");
                arr[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < leng; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += arr[i][j];
            }
            double average = (double) total / 3;

            System.out.println((i+1) + "번 학생의 총점: " + total + ", 평균: " + average);
        }

    }
}

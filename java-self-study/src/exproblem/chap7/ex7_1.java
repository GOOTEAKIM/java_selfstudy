package exproblem.chap7;

import java.util.Scanner;

public class ex7_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("사용자로부터 입력받은 이름과 나이를 출력하세요");

        System.out.print("당신의 이름을 입력하세요 : ");
        String name = input.next();

        System.out.print("당신의 나이을 입력하세요 : ");
        int age = input.nextInt();

        System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "살입니다.");
    }
}

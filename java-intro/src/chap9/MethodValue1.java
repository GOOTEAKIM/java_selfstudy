package chap9;

public class MethodValue1 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println(num1);
        chageNumber(num1);
        System.out.println(num1);
    }

    public static void chageNumber(int num2) {
        System.out.println(num2);
        num2 *= 2;
        System.out.println(num2);
    }
}

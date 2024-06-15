package chap9;

public class MethodReturn2 {
    public static void main(String[] args) {
        checkAge(10);
        checkAge(12);
    }

    public static void checkAge(int age) {
        if (age < 18 ) {
            System.out.println("미성년자는 출입 불가");
        } else {
            System.out.println("입장하셈");
        }
    }
}

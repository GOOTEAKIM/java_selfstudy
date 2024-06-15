package chap6.scope;

public class Scope1 {
    public static void main(String[] args) {
        int m = 10;

        if (true) {
            int x = 20;
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        }

//        System.out.println("main x = " + x);
        // 오류 나는 것이 정상

        System.out.println("main m = " + m);
    }
}

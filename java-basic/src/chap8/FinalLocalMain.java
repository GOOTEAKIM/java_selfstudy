package chap8;

public class FinalLocalMain {
    public static void main(String[] args) {
        final int data1;
        data1 = 10;

        final int data2 = 10;

        method(data1);
    }

    static void method(final int parameter) {
        System.out.println(parameter);
    }
}

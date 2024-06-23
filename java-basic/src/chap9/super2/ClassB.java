package chap9.super2;

public class ClassB extends ClassA {
    public ClassB(int a) {
        this(a,0);
        System.out.println("ClassB 생성자2 a= " + a);
    }

    public ClassB(int a, int b) {
        super();
        System.out.println("ClassB 생성자1 a=" + a + " b= " + b);
    }
}

package chap11.ex5;

public class Cat implements InterfaceAnimal{

    @Override
    public void sound() {
        System.out.println("냐옹");
    }

    @Override
    public void move() {
        System.out.println("고양이가 걸어다닙니다.");
    }
}

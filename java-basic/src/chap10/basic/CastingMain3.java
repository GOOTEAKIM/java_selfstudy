package chap10.basic;

public class CastingMain3 {
    public static void main(String[] args) {
        Child child = new Child();

        Parent parent1 = (Parent) child; // 업캐스팅 생략 가능
        Parent parent2 = child; // 업케스팅 생략

    }
}

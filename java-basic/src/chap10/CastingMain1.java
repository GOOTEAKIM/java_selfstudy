package chap10;

public class CastingMain1 {
    public static void main(String[] args) {
        Parent poly = new Child();
//        poly.childMethod(); // 자식 기능은 호출 불가

        Child child = (Child) poly;
        child.childMethod();

    }
}

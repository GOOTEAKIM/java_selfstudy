package chap4.cond;

public class If5 {
    public static void main(String[] args) {
        int price = 15000;
        int age = 8;

        if (price >= 10000) {
            price -= 1000;
//            System.out.println(price);
        }

        if (age <=10){
            price -= 1000;
            System.out.println(price);
        }
    }
}

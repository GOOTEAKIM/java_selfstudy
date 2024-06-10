package chap4.cond;

public class If4 {
    public static void main(String[] args) {
        int age = 6;

        if (age >=20){
            System.out.println("성인");
        } else if (17<=age && age<=19) {
            System.out.println("고등학생");
        } else if (14<=age && age<=16) {
            System.out.println("중학생");
        } else if (8<=age && age<=13) {
            System.out.println("초등학생");
        }
        else {
            System.out.println("미취학");
        }
    }
    
}

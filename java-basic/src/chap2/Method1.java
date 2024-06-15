package chap2;

public class Method1 {
    public static void main(String[] args) {
        Student student1 = new Student();

        initStudent(student1, "학생1", 15, 90);

        Student student2 = new Student();

        initStudent(student2, "학생2", 16, 100);

        printStudent(student1);
        printStudent(student2);

    }

    public static void initStudent(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    public static void printStudent(Student studente) {
        System.out.println("이름: " + studente.name + " 나이: " + studente.age + " 성적: " + studente.grade);
    }
}

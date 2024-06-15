package chap2;

public class Method2 {
    public static void main(String[] args) {
        Student student1 = createStudent("학생 1", 15, 90);
        Student student2 = createStudent("학생 2", 16, 95);

        printStudent(student1);
        printStudent(student2);
    }

    public static Student createStudent(String name, int age, int grade) {
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;

        return student;
    }

    public static void printStudent(Student studente) {
        System.out.println("이름: " + studente.name + " 나이: " + studente.age + " 성적: " + studente.grade);
    }
}

# 6/15

## 1. 클래스와 데이터

### 클래스
---
#### 클래스 도입

```java
package class1;
public class Student {

 String name;
 int age;
 int grade;
}
```
- 클래스 : Student  
- 변수 : name, age, grade
  - 멤버 변수 == 필드

- `클래스는 관례상 대문자로 시작하고 Camel Case를 사용한다.`
  - ex: Student, User, MemberService
---

### 클래스, 객체, 인스턴스

- 클래스 : 설계도
- 객체 == 인스턴스 : 설계도를 기반으로 실제 메모리에 만들어진 실체

- Student class

```java
package class1;
public class Student {
 String name;
 int age;
 int grade;
}
```

- Student class 사용

  ```java
  package class1;
  public class ClassStart3 {
      public static void main(String[] args) {

          Student student1;

          student1 = new Student();
          student1.name = "학생1";
          student1.age = 15;
          student1.grade = 90;


          Student student2 = new Student();
          
          student2.name = "학생2";
          student2.age = 16;
          student2.grade = 80;

          System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 성적:" + student1.grade);
          System.out.println("이름:" + student2.name + " 나이:" + student2.age + " 성적:" + student2.grade);

      }
  }
  ```

  - 클래스 : Student
  - 객체 : Student1, Student2
---
1. 변수선언

    ```java
    Student Student1;
    ```

  - Student 타입을 받을 수 있는 변수(== Student1)를 선언

2. 객체 생성

- `new 클래스명()`

    ```java
    Student1 = new Student();
    ```

  - new Student() : 
    - new == 새로 생성한다. 
    - Student 클래스를 기반으로 새로운 객체 생성.
    - 메모리에 실제 Student 객체 생성.
    - Student 클래스의 변수를 사용할 수 있다.
---
### 클래스, 객체, 인스턴스 정리

#### 클래스 - Class
- 클래스는 객체를 생성하기 위한 설계도 
- 클래스는 객체가 가져야 할 변수, 메서드를 정의한다. 
---
#### 객체 - Object

- 클래스에서 정의한 속성과 기능을 가진 실체이다.
- 객체는 서로 독립적인 상태를 가진다.
---
#### 인스턴스 - Instance

- 특정 클래스로부터 생성된 객체를 의미
- 객체가 어떤 클래스에 속해 있는지 강조할 때 사용한다.

  - 'student1 객체는 Student 클래스의인스턴스다.' 라고 표현
---
### 배열 선언 최적화

```java
Student[] students = {student1, student2};

// Student : 클래스
// student1, student2 : 인스턴스
```
---
### for문 최적화

- for - each문 사용 (단축키 == iter)

```java
for (Student s : students) {
 System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
}
```
---
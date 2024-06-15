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
---
2. 객체 생성

- `new 클래스명()`

    ```java
    Student1 = new Student();
    ```

  - new Student() : 
    - new == 새로 생성한다는 의미
    - Student 클래스를 기반으로 새로운 객체 생성.
    - 메모리에 실제 Student 객체 생성.
    - Student 클래스의 변수를 사용할 수 있다.
---
### 클래스, 객체, 인스턴스 정리
---
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

  - 'student1 객체는 Student 클래스의 인스턴스다.' 라고 표현
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

# 6/16

## 2. 기본형과 참조형

### 기본형 vs 참조형 1 - 시작

- 기본형 : int , long , double , boolean 처럼 변수에 사용할 값을 직접 넣을 수 있는 데이터 타입

- 참조형 : `Student student1 , int[] students` 와 같이 데이터에 접근하기 위한 참조(주소)를 저장하는 데이터 타입. 객체 또는 배열에 사용된다.
---
#### 기본형 vs 참조형 - 기본

- 기본형 : 실제 사용하는 값을 변수에 담을 수 있다. 해당 값을 바로 사용할 수 있다.

- 참조형 : 실제 사용하는 값을 변수에 담는 것이 아니다. 실제 객체의 위치(참조, 주소)를 저장한다.
  - 객체 : `.`을 통해서 메모리 상에 생성된 객체를 찾아가야 사용할 수 있다.
  - 배열 : `[ ]`을 통해서 메모리 상에 생성된 배열을 찾아가야 사용할 수 있다.
---
#### 기본형 vs 참조형 - 계산

- 기본형 : 들어있는 값을 그대로 계산에 사용 가능

- 참조형 : 들어있는 참조값을 그대로 사용할 수 없다. 연산 불가
---
#### 기본형 vs 참조형 - 형태

- `기본형을 제외하고는 모두 참조형이다.`

- 기본형
  - 소문자로 시작한다. 
    - int, long, double, boolean
  - 자바가 기본으로 제공하는 데이터 타입이다.
  - 개발가 새로 정의할 수 없다.(개발자는 클래스만 직접 정의 가능)

- 클래스 
  - 대문자로 시작한다. (`String` 도 클래스다.)
  - 클래스는 모두 참조형이다.
---
### 기본형 vs 참조형 2 - 변수 대입

- `대원칙: 자바는 항상 변수의 값을 복사해서 대입한다.`

- 기본형, 참조형 모두 항상 변수에 있는 값을 복사해서 대입한다.
---
### 기본형 vs 참조형 3 - 메서드 호출

- 기본형
  - 메서드로 기본형 데이터를 전달하면, 해당 값이 복사되어 전달된다.
  - 메서드 내부에서 매개변수(파라미터)의 값을 변경해도, 호출자의 변수 값에는 영향이 없다.

- 참조형
  - 메서드로 참조형 데이터를 전달하면, 참조값이 복사되어 전달된다.
  - 메서드 내부에서 매개변수(파라미터)로 전달된 객체의 멤버 변수를 변경하면, 호출자의 객체도 변경된다.
---
#### 기본형과 메서드 호출

```java
public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전: a = " + a);

        changePrimitive(a);
        System.out.println("메서드 호출 후: a = " + a);
    }

    static void changePrimitive(int x) {
        x = 20;
    }
}

// 결과
// 10
// 10
```
1. 메서드 호출
   - 10 이라는 값 전달
   - x == 10

2. 메서드 안에서 값을 변경
   - x == 20로 변경
   - a = 10 으로 유지

3. 메서드 종료
   - a의 값이 변하지 않았다는 것을 알 수 있다.
---
#### 참조형과 메서드 호출

```java
public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();

        dataA.value = 10;
        System.out.println("메서드 호출 전: dataA.value = " + dataA.value);

        changeReference(dataA);
        System.out.println("메서드 호출 후: dataA.value = " + dataA.value);

    }
    
    static void changeReference(Data dataX) {
        dataX.value = 20;
    }
}
// 결과
// 10
// 20
```
---
1. 메서드 호출
   - dataX에 dataA의 값을 전달
   - 참조값을 복사해서 전달
   - 둘 다 같은 참조값을 가진다.
   - dataX로도 Data 인스턴스에 접근 가능

2. 메서드 안에서 값을 변경
   - dataX.value = 20 대입
   - 참조값을 통해 Data 인스턴스에 접근하고 그 안에 있는 value 값을 20으로 변경
   - dataA, dataX 둘 다 같은 인스턴스를 참조해서 둘 다 20이라는 값을 가진다.

3. 메서드 종료
   - dataA.value == 20
---
### 변수와 초기화
---
#### 변수의 종류

- 멤버 변수(필드) : 클래스에 선언
- 지역 변수 : 메서드에 선언, 매개변수도 지역 변수의 한 종류다.
---
#### 변수의 값 초기화

- 멤버 변수 : 자동 초기화
  - 인스턴스의 멤버 변수는 생성할 때 자동으로 초기화 된다.
    - int = 0 
    - boolean = false 
    - 참조형 = null

- 지역 변수 : 수동 초기화
  - 지역 변수는 항상 직접 초기화 해야한다.
---
### null

- '값이 존재하지 않는, 없다' 를 의미
---
### NullPointerException

- null 호출했을 때 발생하는 오류
- 찾아갈 수 있는 객체가 없을 때 발생
- null에 `.`을 찍었을 때 발생한다.
---
### 정리
---
#### 기본형

- 기본
  - int, long, double, boolean
  - 기본형 변수는 값을 직접 저장
  - 기본형 변수는 산술 연산 수행 가능
  - null 할당 불가

- 대입
  - 변수 안에 있는 값을 읽고 복사해서 전달
  - 사용하는 값을 복사해서 전달

 - 호출
   - 메서드 내부에서 매개변수(파라미터)의 값을 변경해도 호출자의 변수 값에는 영향이 없다.
---
#### 참조형

- 기본형
  - 기본형을 제외한 나머지 모든 변수
  - 클래스와 배열을 다루는 변수
  - 참조형 변수는 참조를 저장
  - 참조형 변수는 산술 연산 수행 불가
  - null 할당 가능

- 대입
  - 변수 안에 있는 값을 읽고 복사해서 전달
  - 참조값을 복사해서 전달

- 호출
  - 메서드 내부에서 매개변수(파라미터)로 전달된 객체의 멤버 변수를 변경하면, 호출자의 객체도 변경된다.
---
# 6/15

## 커피잔 아이콘이 뜨면서 코드 실행이 안될 때?

- src 우클릭 - Make Directory as - Source Root

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
# 6/17
## 3. 객체 지향 프로그래밍

### 절차 지향 프로그래밍

- 절차를 지향한다.
- 실행 순서를 중요하게 생각하는 방식
- 프로그램의 흐름을 순차적으로 따르며 처리하는 방식
---
#### 절차 지향 프로그래밍의 한계

- 데이터와 기능이 분리되어 있다.
---
### 객체 지향 프로그래밍

- 객체를 지향한다.
- 객체를 중요하게 생각하는 방식
- "무엇을" 중심으로 프로그래밍 한다.
- `모든 사물을 속성과 기능을 가진 객체로 생각하는 것`
---
### 둘의 중요한 차이

- 절차 지향 : 데이터와 해당 데이터에 대한 처리 방식이 분리되어 있다.
- 객체 지향 : 데이터와 그 데이터에 대한 행동(메서드)이 하나의 '객체' 안에 함께 포함되어 있다.
---
### 객체 : 속성, 기능을 가짐
---

# 6/22

## 4. 생성자

### this

- this는 인스턴스 자신의 참조값을 가리킨다.
- 매개변수의 이름과 맴버 변수의 이름이 같은 경우 this 를 사용해서 둘을 명확하게 구분해야 한다.

- this() 는 생성자 코드의 첫줄에만 작성할 수 있다.
---
### 생성자 - 도입
---
#### 생성자 : 객체를 생성하자마자 즉시 필요한 기능을 좀 더 편리하게 수행할 수 있도록 하는 것

- 생성자의 이름은 클래스 이름과 같아야 한다. 첫 글자도 대문자로 시작한다.
- 생성자는 반환 타입이 없다.
- 나머지는 메서드와 같다.
---
#### 생성자 호출

- 생성자는 인스턴스를 생성하고 나서 즉시 호출된다.
- 생성자를 호출하는 방법은 new 명령어 다음에 생성자 이름과 매개변수에 맞추어 인수를 전달하면 된다.

```java
new 생성자이름(생성자에 맞는 인수 목록)
new 클래스이름(생성자에 맞는 인수 목록)
```
---
#### 생성자 장점

- 중복 호출 제거
- 객체를 생성할 때 직접 정의한 생성자가 있다면 직접 정의한 생성자를 반드시 호출해야한다.
---
### 기본 생성자

- 생성자는 반드시 호출되어야 한다.
- 생성자가 없으면 기본 생성자가 제공된다.
- 생성자가 하나라도 있으면 기본 생성자가 제공되지 않는다
---

# 6/18
## 5. 패키지

### 패키지 사용

- 다른 패키지에서 특정 클래스의 생성자를 호출하려면 public을 사용해야 한다.

```java
package pack;
public class PackageMain1 {
    public static void main(String[] args) {
        Data data = new Data();
        pack.a.User user = new pack.a.User();
    }
}

// 패키지 pack Data 생성
// 패키지 pack.a 회원 생성
```

- 사용자와 같은 위치: 같은 패키지에 있는 경우에는 패키지 경로를 생략해도 된다.

- 사용자와 다른 위치: 패키지가 다르면 pack.a.User 와 같이 패키지 전체 경로를 포함해서 클래스를 적어줘야 한다.
---
### 패키지 - import

- `import 패키지의 경로.호출하고 싶은 클래스`
- `*` : 패키지의 모든 클래스
---
### 패키지 규칙

- 패키지의 이름과 위치는 폴더(디렉토리) 위치와 같아야 한다. (필수)
- 패키지 이름은 모두 소문자를 사용한다. (관례)

---

# 6/22

## 6. 접근 제어자

### 접근 제어자의 종류
---
- private 
  - 클래스 안으로 속성과 기능을 숨길 때 사용, 
  - 외부 클래스에서 해당 기능을 호출할 수 없다.
---
- default (package-private)
  - 같은 패키지안에서 호출은 허용한다. 
  - 패키지 안으로 속성과 기능을 숨길 때 사용
  - 외부 패키지에서 해당 기능을 호출할 수 없다.
---
- protected
  - 같은 패키지안에서 호출은 허용한다. 
  - 패키지가 달라도 상속 관계의 호출은 허용한다.
  - 상속 관계로 속성과 기능을 숨길 때 사용
  - 상속 관계가 아닌 곳에서 해당 기능을 호출할 수 없다.
---
- public 
  - 모든 외부 호출을 허용한다.
  - 기능을 숨기지 않고 어디서든 호출할 수 있게 공개한다.
---
- private 이 가장 많이 차단하고, public 이 가장 많이 허용한다.
- `private -> default -> protected -> public`
---
#### 접근 제어자 사용 위치
- 필드, 메서드, 생성자에 사용된다.
- 클래스 레벨에도 이부 접근 제어자를 사용할 수 있다.
---
### 캡슐화

- 데이터와 해당 데이터를 처리하는 메서드를 하나로 묶어서 외부에서의 접근을 제한하는 것
- 데이터의 직접적인 변경을 방지하거나 제한할 수 있다.
- 속성과 기능을 하나로 묶고, 외부에 꼭 필요한 기능만 노출하고 나머지는 모두 내부로 숨기는 것이다.
---
1. 캡슐화에서 가장 필수로 숨겨야 하는 것은 속성(데이터)이다. 
2. 기능도 모두 감추는 것이 좋다. 필요한 기능만 노출하는 것이 좋다.

---

# 6/23

## 7. 자바 메모리 구조와 static

### 자바 메모리 구조(간략하게)
---
- 메서드 영역 
  - 클래스 정보를 보관
  - 이 클래스 정보가 붕어빵 틀
  ---
- 스택 영역
  - 실제 프로그램이 실행되는 영역이다. 
  - 메서드를 실행할 때 마다 하나씩 쌓인다.
  ---
- 힙 영역: 
  - 객체(인스턴스)가 생성되는 영역이다. 
  - new 명령어를 사용하면 이 영역을 사용한다. 
  - 쉽게 이야기해서 붕어빵 틀로부터 생성된 붕어빵이 존재하는 공간이다. 
---
### 자바 메모리 구조 - 실제
---
#### 메서드 영역(Method Area)

- 메서드 영역은 프로그램을 실행하는데 필요한 공통 데이터를 관리한다. 
- 이 영역은 프로그램의 모든 영역에서 공유한다.
  
  ---
  - 클래스 정보 
    - 클래스의 실행 코드(바이트 코드), 필드, 메서드와 생성자 코드등 모든 실행 코드가 존재한다.
  ---
  - static 영역 
    - static 변수들을 보관한다. 
  ---
  - 런타임 상수 풀 
    - 프로그램을 실행하는데 필요한 공통 리터럴 상수를 보관한다. 
    - 이 외에도 프로그램을 효율적으로 관리하기 위한 상수들을 관리한다.
---
#### 스택 영역(Stack Area)

- 자바 실행 시, 하나의 실행 스택이 생성된다. 
- 각 스택 프레임은 지역 변수, 중간 연산 결과, 메서드 호출 정보 등을 포함한다.

  - 스택 프레임: 스택 영역에 쌓이는 네모 박스가 하나의 스택 프레임이다. 
  - 메서드를 호출할 때 마다 하나의 스택 프레임이 쌓이고, 메서드가 종료되면 해당 스택 프레임이 제거된다.
---
#### 힙 영역(Heap Area)

- 객체(인스턴스)와 배열이 생성되는 영역이다. 
- 가비지 컬렉션(GC)이 이루어지는 주요 영역이며, 더 이상 참조되지 않는 객체는 GC에 의해 제거된다.
---
### statc 변수

```java
public class Data3 {
    public String name;
    public static int count; //static
}
```

- 멤버 변수 : name, count
---
#### 멤버 변수의 종류

- 인스턴스 변수: static 이 붙지 않은 멤버 변수, 예. name

  - static 이 붙지 않은 멤버 변수는 인스턴스를 생성해야 사용할 수 있고, 인스턴스에 소속되어 있다. 
  - 따라서 인스턴스 변수라 한다.
  - 인스턴스 변수는 인스턴스를 만들 때 마다 새로 만들어진다.
  ---
- 클래스 변수: static 이 붙은 멤버 변수, 예. count

  - 클래스 변수, 정적 변수, static 변수등으로 부른다. 용어를 모두 사용하니 주의하자
  - static 이 붙은 멤버 변수는 인스턴스와 무관하게 클래스에 바로 접근해서 사용할 수 있고, 클래스 자체에 소속되어 있다. 따라서 클래스 변수라 한다.
  - 클래스 변수는 자바 프로그램을 시작할 때 딱 1개가 만들어진다. 인스턴스와는 다르게 보통 여러곳에서 공유하는 목적으로 사용된다.
---
### static 메서드

- deco() : 문자열을 꾸미는 기능
- static 이 붙은 정적 메서드는 객체 생성 없이 `클래스명 + .(dot) + 메서드 명` 으로 바로 호출 가능하다.
---
#### 정적 메서드 사용법

- static 메서드는 static 만 사용할 수 있다.
  - 클래스 내부의 기능을 사용할 때, 정적 메서드는 static 이 붙은 정적 메서드나 정적 변수만 사용할 수 있다.
  - 클래스 내부의 기능을 사용할 때, 정적 메서드는 인스턴스 변수나, 인스턴스 메서드를 사용할 수 없다.
  ---
- 반대로 모든 곳에서 static 을 호출할 수 있다.
  - 정적 메서드는 공용 기능이다. 따라서 접근 제어자만 허락한다면 클래스를 통해 모든 곳에서 static 을 호출할 수 있다.
---
#### 멤버 메서드의 종류

- 인스턴스 메서드: static 이 붙지 않은 멤버 메서드

- 클래스 메서드: static 이 붙은 멤버 메서드
  - 클래스 메서드, 정적 메서드, static 메서드등으로 부른다.
---
#### static import

- 정적 메서드를 사용할 때 해당 메서드를 다음과 같이 자주 호출해야 한다면 static import 기능을 고려하자.

  ```java
  DecoData.staticCall();
  DecoData.staticCall();
  DecoData.staticCall();
  ```

- 이 기능을 사용하면 다음과 같이 클래스 명을 생략하고 메서드를 호출할 수 있다. 

  ```java
  staticCall();
  staticCall();
  staticCall();
  ```
---

# 6/23

## 8. final

### final 변수와 상수

- 변수에 final 키워드가 붙으면 더는 값을 변경할 수 없다.
- final은 class, method 등 여러 곳에 붙을 수 있다.

#### static final

- final + 필드 초기화를 사용하는 경우, static 을 붙여서 사용하는 것이 효과적이다.

#### 상수(Constant)

- 변하지 않고, 항상 일정한 값을 갖는 수를 말한다.

#### 자바 상수 특징

- static final 키워드를 사용한다.
- 대문자를 사용하고 구분은 `_ (언더스코어)`로 한다.
  - 일반적인 변수와 상수를 구분하기 위해 이렇게 한다.
- 필드를 직접 접근해서 사용한다.
  - 상수는 기능이 아니라 고정된 값 자체를 사용하는 것이 목적이다.
  - 상수는 값을 변경할 수 없다.

### 정리

- 만약 특정 변수의 값을 할당한 이후에 변경하지 않아야 한다면 final 을 사용한다.
---

# 6/24

## 9. 상속

### 상속 관계

- 기존 클래스의 속성과 기능을 그대로 물려받는다.
- 상속을 사용하려면 extends 키워드를 사용하면 된다. 
  - extends 대상은 `하나`만 선택할 수 있다.
---
#### 용어 정리

- 부모 클래스 (슈퍼 클래스): 상속을 통해 자신의 필드와 메서드를 다른 클래스에 제공하는 클래스
- 자식 클래스 (서브 클래스): 부모 클래스로부터 필드와 메서드를 상속받는 클래스
---
#### 단일 상속

- 부모는 (놀랍게도?) 한명이다.
- 부모가 또 다른 부모를 가지는 것은 괜찮다.
---
### 메서드 오버라이딩

- 부모에게서 상속 받은 기능을 자식이 재정의 하는 것
- 상속 관계에서는 기존 기능을 다시 정의한다고 이해하면 된다.

- 사용법 : `@Override` 를 붙이고 재정의 한다.

  ```java
  public class Car {
      public void move() {
          System.out.println("차를 이동합니다.");
      }
  }
  ```

  ```java
  public class ElectricCar extends Car {
      @Override
      public void move() {
          System.out.println("전기차를 빠르게 이동합니다.");
      }
      public void charge() {
          System.out.println("충전합니다.");
      }
  }
  ```
---
#### 메서드 오버라이딩 조건

- 메서드 이름: 메서드 이름이 같아야 한다.
- 메서드 매개변수(파라미터): 매개변수(파라미터) 타입, 순서, 개수가 같아야 한다.
- 반환 타입: 반환 타입이 같아야 한다. 단 반환 타입이 하위 클래스 타입일 수 있다.
- 접근 제어자: 오버라이딩 메서드의 접근 제어자는 상위 클래스의 메서드보다 더 제한적이어서는 안된다.

- 예외: 오버라이딩 메서드는 상위 클래스의 메서드보다 더 많은 체크 예외를 throws 로 선언할 수 없다. 하지만더 적거나 같은 수의 예외, 또는 하위 타입의 예외는 선언할 수 있다. 예외를 학습해야 이해할 수 있다. 

- static , final , private : 키워드가 붙은 메서드는 오버라이딩 될 수 없다.

  - static 은 클래스 이름을 통해 필요한 곳에 직접 접근하면 된다.
  - final 메서드는 재정의를 금지한다.
  - private 메서드는 해당 클래스에서만 접근 가능하기 때문에 하위 클래스에서 보이지 않는다. 따라서 오버라이딩 할 수 없다.

- 생성자 오버라이딩: 생성자는 오버라이딩 할 수 없다
---
### super - 부모 참조

- 부모와 자식의 필드명이 같거나 메서드가 오버라이딩 되어 있으면, 자식에서 부모의 필드나 메서드를 호출할 수 없다. 
- super 키워드를 사용하면 부모를 참조할 수 있다.
- super 는 이름 그대로 부모 클래스에 대한 참조를 나타낸다.
---
### super - 생성자

- 상속 관계를 사용하면 자식 클래스의 생성자에서 부모 클래스의 생성자를 반드시 호출해야 한다.
- 상속 관계에서 부모의 생성자를 호출할 때는 `super(...)` 를 사용하면 된다.
---
### 클래스와 메서드에 사용되는 final
---
#### 클래스에 final

- 상속 끝!
- final 로 선언된 클래스는 확장될 수 없다. 다른 클래스가 final 로 선언된 클래스를 상속받을 수 없다.
- 예: public final class MyFinalClass {...}
---
#### 메서드에 final

- 오버라이딩 끝!
- final 로 선언된 메서드는 오버라이드 될 수 없다. 상속받은 서브 클래스에서 이 메서드를 변경할 수 없다.
- 예: public final void myFinalMethod() {...}
---

# 6/27

## 10. 다형성 1

### 다형성 시작

- 객체 지향 프로그래밍의 대표적인 특징

- 캡슐화
- 상속
- 다형성 : 다양한 형태, 여러 형태
---
#### 다형성을 이해하기 위한 핵심 이론

- 다형적 참조
- 메서드 오버라이딩

---

### 다형적 참조

- 자바에서 부모 타입은 자신은 물론이고, 자신을 기준으로 모든 자식 타입을 참조할 수 있다. 
- 하나의 변수 타입으로 다양한 자식 인스턴스를 참조할 수 있는 기능

  ```java

  public class Parent {
      public void parentMethod() {
          System.out.println("Parent.parentMethod");
      }
  }
  ```

  ```java
  public class Child extends Parent {
      public void childMethod() {
          System.out.println("Child.childMethod");
      }
  }
  ```

  ```java
  // 다형적 참조: 부모는 자식을 품을 수 있다.
  public class PolyMain {
      public static void main(String[] args) {

          // 부모 변수가 부모 인스턴스 참조
          System.out.println("Parent -> Parent");
          Parent parent = new Parent();
          parent.parentMethod();

          // 자식 변수가 자식 인스턴스 참조
          System.out.println("Child -> Child");
          Child child = new Child();
          child.parentMethod();
          child.childMethod();

          //부모 변수가 자식 인스턴스 참조(다형적 참조)
          System.out.println("Parent -> Child");
          Parent poly = new Child();
          poly.parentMethod();

          //Child child1 = new Parent(); 자식은 부모를 담을 수 없다.

          //자식의 기능은 호출할 수 없다. 컴파일 오류 발생
          //poly.childMethod();
      }
  }
  ```

1. 부모 타입의 변수가 부모 인스턴스 참조

   - `Parent -> Parent: parent.parentMethod()`
     
   - 부모 타입의 변수가 부모 인스턴스를 참조한다.
   - Parent parent = new Parent()
   - Parent 인스턴스를 만들었다. 이 경우 부모 타입인 Parent 를 생성했기 때문에 메모리 상에 Parent 만 생성된다.(자식은 생성되지 않는다.)
   - 생성된 참조값을 Parent 타입의 변수인 parent 에 담아둔다.
   - parent.parentMethod() 를 호출하면 인스턴스의 Parent 클래스에 있는 parentMethod() 가 호출된
   다.
    ---
2. 자식 타입의 변수가 자식 인스턴스 참조

   - `Child -> Child: child.childMethod()`

   - 자식 타입의 변수가 자식 인스턴스를 참조한다.
   - Child child = new Child()
   - Child 인스턴스를 만들었다. 이 경우 자식 타입인 Child 를 생성했기 때문에 메모리 상에 Child 와 Parent 가 모두 생성된다.
   - 생성된 참조값을 Child 타입의 변수인 child 에 담아둔다.
   - child.childMethod() 를 호출하면 인스턴스의 Child 클래스에 있는 childMethod() 가 호출된다.

    --- 

3. 다형적 참조: 부모 타입의 변수가 자식 인스턴스 참조

   - `Parent -> Child: poly.parentMethod()`

   - 부모 타입의 변수가 자식 인스턴스를 참조한다.
   - Parent poly = new Child()
   - Child 인스턴스를 만들었다. 이 경우 자식 타입인 Child 를 생성했기 때문에 메모리 상에 Child 와 Parent 가 모두 생성된다.
   - 생성된 참조값을 Parent 타입의 변수인 poly 에 담아둔다.

   - `부모는 자식을 담을 수 있다.`

   - Parent poly 는 부모 타입이다. new Child() 를 통해 생성된 결과는 Child 타입이다. 자바에서 부모 타입은 자식 타입을 담을 수 있다.
     - Parent poly = new Child() : 성공

   - 반대로 자식 타입은 부모 타입을 담을 수 없다.
     - Child child1 = new Parent() : 컴파일 오류 발생

---

#### 부모는 자식을 담을 수 있지만 자식은 부모를 담을 수 없다.

```java
Parent parent = new Child() // 부모는 자식을 담을 수 있다.
Parent parent = child // 위와 같은 형태
```
---

### 캐스팅

- 업캐스팅 : 부모 타입으로 변경
- 다운캐스팅 : 자식 타입으로 변경

- 다운캐스팅, 실행

  ```java
  //다운캐스팅(부모 타입 -> 자식 타입)
  Child child = (Child) poly;
  child.childMethod();
  ```

- 다운캐스팅으로 child.childMethod() 를 호출할 수 있다.
- childMethod()를 호출하려면 해당 인스턴스를 찾아가고 Child 타입을 찾는다.
---
### 캐스팅의 종류

```java
Child child = (Child) poly
child.childMethod();
```

- 자식 타입의 기능을 사용하려면 다운캐스팅 결과르 변수에 담아두고 이후에 기능을 사용해야한다.
---
#### 일시적 다운 캐스팅

```java
public class CastingMain2 {
    public static void main(String[] args) {

        Parent poly = new Child();
        //단 자식의 기능은 호출할 수 없다. 컴파일 오류 발생
        //poly.childMethod();

        //일시적 다운캐스팅 - 해당 메서드를 호출하는 순간만 다운캐스팅
        ((Child) poly).childMethod();
    }
}
```

- 일시적 다운캐스팅을 사용하면 별도의 변수 없이 인스턴스의 자식 타입의 기능을 사용할 수 있다.
---
#### 업캐스팅

- 현재 타입을 부모 타입으로 변경하는 것

```java
//upcasting vs downcasting
public class CastingMain3 {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = (Parent) child; //업캐스팅은 생략 가능, 생략 권장
        Parent parent2 = child; //업캐스팅 생략

        parent1.parentMethod();
        parent2.parentMethod();
    }
}
```

- 부모 타입으로 변환하는 경우에는 `(타입)` 을 생략할 수 있다.

- 업캐스팅은 생략할 수 있다. 
- 다운캐스팅은 생략할 수 없다. 
- 참고로 업캐스팅은 매우 자주 사용하기 때문에 생략을 권장한다.
---
### instanceof

- 특정 변수가 참조하는 인스턴스 타입을 확인하고 싶으면 instanceof 을 사용하면 된다.

  ```java
  public class CastingMain5 {
      public static void main(String[] args) {
          Parent parent1 = new Parent();
          System.out.println("parent1 호출");
          call(parent1);
          Parent parent2 = new Child();
          System.out.println("parent2 호출");
          call(parent2);
      }

      private static void call(Parent parent) {
          parent.parentMethod();
          if (parent instanceof Child) {
          System.out.println("Child 인스턴스 맞음");
          Child child = (Child) parent;
          child.childMethod();
          }
      }
  }
  ```
---
### 자바 16 - Pattern Matching for instanceof

- 자바 16부터는 instanceof 를 사용하면서 동시에 변수를 선언할 수 있다.

  ```java
  public class CastingMain6 {
      public static void main(String[] args) {
          Parent parent1 = new Parent();
          System.out.println("parent1 호출");
          call(parent1);
          Parent parent2 = new Child();
          System.out.println("parent2 호출");
          call(parent2);
      }

      private static void call(Parent parent) {
          parent.parentMethod();
          //Child 인스턴스인 경우 childMethod() 실행
          if (parent instanceof Child child) {
          System.out.println("Child 인스턴스 맞음");
          child.childMethod();
          }
      }
  }
  ```
---
### 메서드 오버라이딩

- 기존 기능을 하위 타입에서 새로운 기능으로 재정의

- `오버라이딩 된 메서드가 항상 우선권을 가진다.`

  ```java
  public class Parent {
      public String value = "parent";

      public void method() {
          System.out.println("Parent.method");
      }
  }
  ```

  ```java
  public class Child extends Parent {
      public String value = "child";

      @Override

      public void method() {
          System.out.println("Child.method");
      }
  }
  ```

- Child 에서 Parent 의 method() 를 재정의(오버라이딩) 했다.

  ```java
  public class OverridingMain {
      public static void main(String[] args) {

          //자식 변수가 자식 인스턴스 참조
          Child child = new Child();
          System.out.println("Child -> Child");
          System.out.println("value = " + child.value);
          child.method();

          //부모 변수가 부모 인스턴스 참조
          Parent parent = new Parent();
          System.out.println("Parent -> Parent");
          System.out.println("value = " + parent.value);
          parent.method();

          //부모 변수가 자식 인스턴스 참조(다형적 참조) 
          Parent poly = new Child();
          System.out.println("Parent -> Child");
          System.out.println("value = " + poly.value); //변수는 오버라이딩X
          poly.method(); //메서드 오버라이딩!
      }
  }
  ```

1. Child -> Child

   - child 변수는 Child 타입이다. 
   - 따라서 child.value , child.method() 를 호출하면 인스턴스의 Child 타입에서 기능을 찾아서 실행한다.
    ---
2. Parent -> Parent

   - parent 변수는 Parent 타입이다. 
   - 따라서 parent.value , parent.method() 를 호출하면 인스턴스의 Parent 타입에서 기능을 찾아서 실행한다.
    ---
3. `Parent -> Child`

   - poly 변수는 Parent 타입이다. 
   - 따라서 poly.value , poly.method() 를 호출하면 인스턴스의 Parent 타입에서 기능을 찾아서 실행한다.

     - poly.value : Parent 타입에 있는 value 값을 읽는다.
     - poly.method() : Parent 타입에 있는 method() 를 실행하려고 한다. 그런데 하위 타입인 Child.method() 가 오버라이딩 되어 있다. `오버라이딩 된 메서드는 항상 우선권을 가진다.` 따라서 Parent.method() 가 아니라 Child.method() 가 실행된다.

   - `오버라이딩 된 메서드는 항상 우선권을 가진다.`
---

# 6/29

## 11. 다형성 2

### 추상 클래스 1
---
#### 추상 클래스

- 부모 클래스는 제공하지만, 실제 생성되면 안되는 클래스
- 추상적인 개념을 제공하는 클래스
- 실체인 인스턴스가 존재하지 않는다. 인스턴스를 생성할 수 없다.
- 상속을 목적으로 사용되고, 부모 클래스 역할을 담당한다.

  ```java
  abstract class AbstractAnimal {...}
  ```

- 추상 클래스는 클래스를 선언할 때 앞에 abstract 키워드를 붙여주면 된다.

---

#### 추상 메서드

- 추상적인 개념을 제공하는 메서드
- 부모 클래스를 상속 받는 자식 클래스가 `반드시 오버라이딩 해야 하는 메서드`
- 실체가 존재하지 않고, 메서드 바디가 없다.

  ```java
  public abstract void sound();
  ```

- `추상 메서드가 하나라도 있는 클래스는 추상 클래스로 선언해야 한다.`
- `추상 메서드는 상속 받는 자식 클래스가 반드시 오버라이딩 해서 사용해야 한다.`

---

### 추상 클래스 2
---
#### 순수 추상 클래스

- 순수 추상 클래스

  ```java
  public abstract class AbstractAnimal {
      public abstract void sound();
      public abstract void move();
  }
  ```

- 인스턴스를 생성할 수 없다.
- 상속시 자식은 모든 메서드를 오버라이딩 해야 한다.
- 주로 다형성을 위해 사용된다.

- `상속하는 클래스는 모든 메서드를 구현해야 한다.`
---
### 인터페이스

- 순수 추상 클래스를 더 편리하게 사용할 수 있는 기능

- 인터페이스

  ```java
  public interface InterfaceAnimal {
    public abstract void sound();
    public abstract void move();
  }
  ```

- 인터페이스 - public abstract 키워드 생략 가능

  ```java
  public interface InterfaceAnimal {
    void sound();
    void move();
  }
  ```

- 인터페이스의 메서드는 모두 public , abstract 이다.
- 메서드에 public abstract 를 생략할 수 있다. 생략이 권장.
- 인터페이스는 다중 구현(다중 상속)을 지원한다.

  ```java
  public interface InterfaceAnimal {
    void sound();
    void move();
  }
  ```

  ```java
  public class Dog implements InterfaceAnimal {
      @Override
      public void sound() {
          System.out.println("멍멍");
      }
      @Override
      public void move() {
          System.out.println("개 이동");
      }
  }
  ```

- 인터페이스를 상속 받을 때는 extends 대신에 `implements` 사용
- 상속이라는 말 대신 구현이라고 한다.
---
#### 인터페이스를 사용해야 하는 이유

- 인터페이스를 구현하는 곳에서 인터페이스의 메서드를 반드시 구현해라는 규
약(제약)을 주는 것이다.
- 부모를 여러명 두는 다중 구현(다중 상속)이 가능하다.
---

# 7/1

## 12. 다형성과 설계

### 객체 지향 특징

- 추상화
- 캡슐화
- 상속
- 다형성
---
### 정리

- 다형성이 가장 중요하다
- 디자인 패턴 대부분은 다형성을 활용하는 것이다
- 스프링의 핵심인 제어의 역전(IoC), 의존관계 주입(DI)도 결국 다형성을 활용하는 것이다.
---
### OCP(Open - Closed Principle) 원칙

- Open for extension: 새로운 기능의 추가나 변경 사항이 생겼을 때, 기존 코드는 확장할 수 있어야 한다.
- Closed for modification: 기존의 코드는 수정되지 않아야 한다
---
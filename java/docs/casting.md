## Java Casting

- 목적: 서로 다른 타입간의 연산을 수행할 때, 연산전 타입을 일치시키기 위해 casting을 한다.
- casting(형변환): 변수나 상수의 타입을 다른 타입으로 변환하는 것.

### Primitive type's casting

- 방법: `(type)(피연산자)`
    ```java
    double d = 3.14;
    int a = (int)d; // a is 3
    ```
- primitive type에서 boolean을 제외한 나머지 타입들은 서로 형변환이 가능하다.
- primitive type과 reference type간의 형변환은 불가능하다.

|    casting     |  example  | result |
|:--------------:|:---------:|:------:|
| `int`->`char`  | (char) 65 |  'A'   |
| `char`->`int`  | (int)'A'  |   65   |
| `float`->`int` | (int)1.6f |   1    |
| `int`->`float` | (float)10 | 10.0f  |

#### 정수형끼리 형변환

- int(4byte) -> byte(1byte):  큰 크기에서 작은 크리고 변환하는 경우 '값 손실'이 발생할 수 있다.

```text
00000000 00000000 00000001 00101100 : 300
                           00101100 : 44
```

- 작은 크기에서 큰 타입으로 변환은 값 손실이 없고 빈 공간은 0이나 1로 채운다.
    - 양수인 경우 앞 공간이 0으로 채워지고, 음수인 경우는 1로 채워진다.
    - 이는 2의 보수법에 따라서 형변환 이후에도 부호를 유지하기 위함이다.
- `Integer.toBinaryString(숫자)`로 10진 정수를 2진 정수로 변환한 문자열을 얻을 수 있다.

#### 실수형끼리 형변환

- 작은타입(float) -> 큰 타입(double)인 경우 빈 공간을 0으로 채운다.
    - 지수(E): float의 기저인 127을 뺀 후 double의 기저인 1023을 더해 변환
    - 가수(M): float의 가수 23자리를 채우고 남은 자리를 0으로 채움
- double -> float
    - E: double의 기저인 1023을 빼고 float의 기저인 127을 더함
    - M: double의 가수 52자리 중 23자리만 저장되고 나머지는 버린다.
        - 이때 가수의 24번째 자리 값이 1이면 반올림이 발생해 23번째 값이 1이 증가한다.
    - float type의 범위를 넘는 값이 변환되면 `+-무한대` 혹은 `+-0`을 결과로 얻는다.

#### 정수형 ↔ 실수형 형변환

- 정수 -> 실수
    - 정수를 2진수로 변환 > 정규화 > 실수의 형식으로 저장됨
    - 이때, 실수형의 정밀도 제한으로 오차가 발생할 수 있다.
    - 10진수로 8자리 이상의 값을 실수형으로 변환할 때 double을 사용할 것
- 실수 -> 정수
    - 실수형의 소수점 이하 값은 버려진다.

#### 자동 형변환

- 기존 값을 최대한 보존할 수 있는 타입으로 자동 형병환 된다.
  ```text
  1byte   2byte    4byte   8byte   4byte   8byte
  byte -> shoart -> int -> long -> float -> double
             char ↗
  ```

### Reference type's casting
#### 업 캐스팅
- 하위 클래스가 상위 클래스로 돌리는 것
- 동적 다형성
- 각자 자신에게 구현된 것을 사용하게 하려고(오버라이딩) 사용함
```java
class Parent{
    void show(){
        System.out.println("부모 클래스의 show() 호출");
    }
}

class Child extends Parent{
    @Override
    void show(){
        System.out.println("자식 클래스의 show() 호출");
    }
}

class Main{
    public static void main(String[] args){
        Parent obj = new Child(); // 자식 클래스를 참조하는 부모 클래스 obj
        obj.show(); // child 클래스의 show()가 호출됨
    }
}
```
#### 다운 캐스팅
- 하위 클래스 유형이 부모 클래스의 객체를 참조하는 것
- 컴파일러 오류 발생: ClassCastingException이 runtime exception으로 발생한다.
- instanceof 연산자를 사용해야만 가능하고
- 이미 업 캐스팅된 객체는 다운 캐스팅만 수행 가능하다.
- 평소에는 업 캐스팅을 통해서 특정 함수의 사용을 막고 있다가 필요할 때만 다운캐스팅을 통해서 접근하기도 한다. (admin만 사용할 수 있는 일이 있거나 등)
```java
class Main{
    public static void main(String[] args){
        Parent p = new Child(); // upcasting
        
        // Child c = new Parent(); // downcasting 시도 -> compile error
        
        Child c = (Child)p; // p의 본체(참조하는 것)는 Child 였으므로 다운 캐스팅 성공
    }
}
```
# Regular Expression
regular expression은 검색 패턴을 형성하는 문자열 시퀀스이다.</br>
텍스트 안에서 데이터를 찾을 때, 찾고자하는 것을 묘사하기 위해서 이 검색 패턴을 사용한다.</br>
text search나 text replace 동작을 위해 정규식을 사용한다.</br>
- 목차
  1. 하
  2. 정규식 표현
  3. 

## 정규식 표현

### Pattern

|    표현    | 설명                            |
|:--------:|:------------------------------|
| `[abc]`  | `[]` 사이에 있는 1개의 char를 찾는다.    |
| `[^abc]` | `[]` 사이에 있지 않은 1개의 char를 찾는다. |
| `[0-9]`  | 0~9 범위의 char 1개를 찾는다.         |

### Metacharacters

|    표현    | 설명                                                          |
|:--------:|:------------------------------------------------------------|
|   `.`    | 어떤 char의 하나의 instance                                       |
|   `^`    | 문자열의 시작부분에서 매치하는 것을 찾는다.</br> `^Hello` : Hello로 시작하는 문자열 찾음 |
|   `$`    | 문자열의 끝 부분에서 매치하는 것을 찾는다.</br> `World$` : World로 끝나는 문자열 찾음  |
|   `\d`   | 숫자(digit)을 찾는다.                                             |
|   `\s`   | 공백문자(whitespace) 하나를 찾는다.                                   |
|   `\b`   | 단어의 시작이나 끝에서 일치하는 것을 찾는다. </br> `\bWORD`, `WORD\b`          |
| `\uxxxx` | 16진수의 xxxx로 표시된 유니코드 문자를 찾는다.                               |

### Quantifier(수량)

| quantifier | 설명                          | 예시                               |
|:----------:|:----------------------------|:---------------------------------|
|    `n+`    | 최소 1개 이상의 n을 포함한 string     |                                  |
|    `n*`    | 0개 이상의 n을 포함한 string        | `a*`: 빈문자열도 포함되므로 항상 일치          |
|    `n?`    | 0개 혹은 1개의 n을 포함한 string     | `a?`: 빈 문자열도 포함되므로 항상 일치         |
|   `n{x}`   | n개의 x 시퀀스를 포함한 string       | `a{2}`: aa가 포함되어야함               |
|  `n{x,y}`  | x에서 y까지 n개의 시퀀스를 포함한 string | `a{2,4}`: aa, aaa, aaaa가 포함되어야 함 |
|  `n{x,}`   | 최소 n개의 x를 포함한 string        | `a{2,}`: aa이상 (최소 aa)            |

## `java.util.regex` package

자바는 내장 정규식 클래스가 없지만 `java.util.regex` 패키지를 임포트해서 정규식을 사용할 수 있다.</br>
이 패키지는 3개의 클래스를 포함한다.

1. `Pattern` 클래스: 검색에 사용될 pattern을 정의한다.
2. `Matcher` 클래스: pattern을 이용해서 검색한다.
3. `PatternSyntaxExpression` 클래스: 정규식 패턴에서 신텍스 오류를 표기한다.

### 사용 예시

```java
import java.util.regex.Matcher;
import java.util.regex.Pattern;

Pattern pattern = Pattern.compile("aabbbcc");
Matcher m = pattern.matcher("aabbbccddddddddddeeeeee");

while(m.find()){
    // 0 to 6
    System.out.println("from " + m.start() + " to " + (m.end()-1));
}
```

## 참고자료

- https://www.w3schools.com/java/java_regex.asp
- https://www.w3schools.com/java/java_regex.asp
- https://www.baeldung.com/regular-expressions-java
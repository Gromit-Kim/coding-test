## String 클래스의 메서드

코딩테스트에서 사용할만한 것 위주로 작성해보자.

| 메서드                                                                                       | 기능                                                     |
|:------------------------------------------------------------------------------------------|:-------------------------------------------------------|
| char charAt(int index)                                                                    | index에 있는 문자를 알려준다.                                    |
| int compareTo(String str)                                                                 | str과 사전순서 비교. 같으면 0, 내가 str보다 먼저면 음수, 내가 str보다 나중이면 양수 |
| String concat(String str)                                                                 |                                                        |
| boolean contains(CharSequence s)                                                          | 지정된 문자열(s)가 포함되었는지 검사                                  |
| boolean endsWith(String suffix)                                                           |                                                        |
| boolean startsWith(String prefix)                                                         |                                                        |
| boolean equals(Object obj)                                                                |                                                        |
| boolean equalsIgnoreCase(String str)                                                      | 문자열의 대소문자 없이 비교                                        |
| int indexOf(int ch)                                                                       | 주어진 문자 ch가 존재하는 index를 알려줌. 못찾으면 -1 반환                 |
| int indexOf(int ch, int pos)                                                              | 주어진 문자 ch가 문자열에 존재하는지 pos 위치부터 확인해서 알려준다. 못 찾으면 -1 반환  |
| int indexOf(String str)                                                                   | 주어진 문자열을이 존재하는지 확인하여 그 위치(index)를 알려준다. 못 찾으면 -1 반환    |
| int lastIndexOf(int ch)                                                                   | 지정된 문자를 문자열의 오른쪽 끝부터 찾아서 index를 반환. 못 찾으면 -1 반환        |
| int lastIndexOf(String str)                                                               |                                                        |
| int length()                                                                              | 문자열의 길이를 알려준다.                                         |
| String replace(char old, char nw)                                                         | 문자열 중 old를 nw로 '모두'바꾼 문자열 반환                           |
| String replaceAll(String regex, String replacement)                                       | 지정된 문자열(regex)와 일치하는 것을 새로운 문자열로 모두 변경                 |
| String replaceFirst(String regex, String replacement)                                     | 지정된 문자열(regex)와 일치하는 것 중 첫 번째 것만 새로운 문자열로 변경           |
| String[] split(String regex)                                                              | 지정된 분리자(regex)로 나누어 문자열을 배열에 담아 반환                     |
| String[] split(String regex, int limit)                                                   | regex로 나누어 문자열 배열에 담아 반환. 단, 문자열 전체를 limit로 자른다.       |
| String subString(int begin) </br> String subString(int begin, int end)                    | begin 이상 end 미만까지                                      |
| String toLowerCase()                                                                      |                                                        |
| String toUpperCase()                                                                      |                                                        |
| String trim()                                                                             | 왼쪽 끝과 오른쪽 끝 공백만 제거                                     |
| static String valueOf(T b)</br> 이때, T는 boolean, char, int, long, float, double, Object 가능 | 지정된 값을 문자열로 반환해서 변환. 참조 변수의 경우 toString() 호출 결과를 반환    |

## 문자열 join

```java
String[] arr = {"A", "B", "C", "D", "E"};
String str = String.join("-", arr); // A-B-C-D-E
```

```java
import java.util.StringJoiner;

StringJoiner sj = new StringJoiner("-", "[", "]");
String[] arr = {"A", "B", "C", "D", "E"};

for(
String ele :arr)
        sj.

add(ele);

sj.

toString(); // [A-B-C-D-E]
```

## format

```java
String str = String.format("%d * %d = %d", 3, 5, 15); // C의 printf처럼 사용 가능
```

## StringBuilder method
- StringBuffer는 thread-safe 하지 않다. StringBuilder는 thread safe하도록 동기화되어 잇다.

| 메서드                                                                   | 내용                                        |
|:----------------------------------------------------------------------|:------------------------------------------|
| StringBuilder append(T t)                                             |                                           |
| int capacity()                                                        | StringBuilder instance의 buffer의 크기를 알려준다. |
| char charAt(int index)                                                |                                           |
| StringBuilder delete(int start, int end)                              | start 이상, end 미만 index의 문자열 제거            |
| StringBuilder deleteCharAt(int idx)                                   |                                           |
| StringBuilder insert(int pos, T t)                                    |                                           |
| int length()                                                          |                                           |
| StringBuilder replace(int start, int end, String str)                 | start 이상 end 미만의 문자들을 str로 바꾼다.           |
| StringBuilder reverse()                                               |                                           |
| StringBuilder setCharAt(int index, char ch)                           |                                           |
| String toString()                                                     |                                           |
| String substring(int start)</br> String substring(int start, int end) |                                           |
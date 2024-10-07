# Stack
- Java Collection framework는 Stack 데이터 구조를 모델하고 구현한 클래스를 제공한다.
    - 이 클래스는 LIFO 원칙을 기반으로 한다.
- Stack 클래스는 Vector 클래스를 확장(extends)해서 stack 동작에 대해서 추가적인 기능을 제공한다.

## Stack Class의 Methods
| Method                   | Description                                                                       |
|:-------------------------|:----------------------------------------------------------------------------------|
| `empty()`                | stack의 top에 아무것도 없으면 `true`                                                       |
| `peek()`                 | stack의 top에 있는 element를 반환하고, stack에서 그 요소 제거                                     |
| `push(Object element)`   | stack의 top에 하나의 element를 넣는다.                                                     |
| `search(Object element)` | stack에 하나의 object 존재 여부를 결정한다.</br> 존재하면 top에서부터 그 요소의 위치를 리턴</br> 존재하지 않으면 -1 리턴 |
|||

## Vector class에서 상속받은 Methods
| Method                       | Description                                                                                              |
|:-----------------------------|:---------------------------------------------------------------------------------------------------------|
| `add(Object obj)`            | vector의 끝에 특정 element를 append한다.                                                                         |
| `add(int index, Object obj)` | vector의 특정 위치에 특정 eleement를 삽입한다.                                                                        |
| `addAll(Collection c)`       | vector의 끝에 특정한 Collection 안의 모든 elements를 appends한다.</br> 이때 Collections의 iterator에서 반환된 순서대로 appends된다. |
| `addElement(Object o)`       | vector의 끝에 특정한 component를 추가한다.                                                                          |
| `capacity()`                 | 이 벡터의 현재 capacity를 리턴                                                                                    |
| `clear()`                    | vector 내의 모든 원소 삭제                                                                                       |
| `clone()`                    | 이 벡터의 복제본을 리턴                                                                                            |
| `contains(Object o)`         | 현재 벡터가 특정한 요소를 가지고 있는지 여부를 리턴                                                                            |
|                              ||
더 많은데 생략...

## 관련 문제
- https://school.programmers.co.kr/learn/courses/30/lessons/64061
- https://school.programmers.co.kr/learn/courses/30/lessons/133502

## 참고자료
- https://www.geeksforgeeks.org/stack-class-in-java/
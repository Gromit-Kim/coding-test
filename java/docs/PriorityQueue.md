# 우선순위 큐
- 자바에서 '최대 힙'이나 '최소 힙'을 구현하기 위해서 우선 순위 큐를 쓴다.
    - 기본적으로 `최소 힙`이 설정되어 있다.
    - `최대 힙` 방식을 이용하고 싶다면 `new PriorityQueue<>(Collections.reverseOrder())`를 이용한다.

## 초기화 및 메소드
### 초기화

```java
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

PriorityQueue<Integer> minHeapQueue = new PriorityQueue<>();
PriorityQueue<Integer> maxHeapQueue = new PriorityQueue<>(Collections.reverseOrder());

PriorityQueue<Integer> pq = new PriorityQueue<>(3); // queue의 사이즈를 3으로 제한
PriorityQueue<Integer> pq2 = new PriorityQueue<>(3, Comparator.reverseOrder());
```

### 메소드
| 함수명                                      | 사용                                                                  |
|:-----------------------------------------|:--------------------------------------------------------------------|
| `add(E e)`                               | 우선순위 큐로 특정 엘리먼트를인서트 한다.                                             |
| `clear()`                                | 우선순위 큐의 모든 요소를 제거 한다.                                               |
| `comparator()`                           | 큐에 있는 요소를 정렬하는 comparator를 리턴한다. 만약 큐가 자연 순서로 정렬되면 null을 리턴한다.      |
| `contains?(Object o)`                    | queue에 원소가 들어있는지 아닌지를 리턴한다.                                         |
| `forEach?(Consumer<? super E> action)`   | 모던 요소가 처리되거나 액션이 예외를 던질 때 까지 각 요소들에게 반복된 수행을 한다.                    |
| `iterator()`                             | 큐에서 요소들에 괂 iterator를 리턴한다.                                          |
| `offer?(E e)`                            | 우선순위 큐로 새로운 요소를 집어 넣는다.                                             |
| `remove?(Object o)`                      | 쿠에서 특정한 요소 인스턴스 하나를 제거한다.                                           |
| `removeAll?(Collection<?> c)`            | 특정한 collection에 포함된 collection의 요소들 모두를 제거한다.                       |
| `removeIf?(Predicate<? super E> filter)` | 주어진 predicate를 만족시키는 collection의 요소들을 모두 제거한다.                      |
| `retainAll?(Collection<?> c)`            | c에 포함된 요소들만 리턴한다.                                                   |
| `spliterator()`                          | 큐의 요소들에 대해 늦은 바인딩과 fail-fast Spliterator를 만든다.                      |
| `toArray()`                              | queue의 모든 요소들을 포함하는 array를 리턴한다.                                    |
| `toArray?(T[] a)`                        | 큐의 모든 요소들을 포함하는 array를 리턴한다. 이때 리턴되는 배열의 실시간 타입은 특정한 배열의 타입으로 맞춰진다. |

### 필수 기억 메소드
- add(E e)
- contains(Object o)
- toArray()
- element(): 현재 큐의 head에 있는 것을 제거하지 않고 가져오기만 한다. (abstract queue의 인터페이스에 선언됨)
  - peek(): queue의 인터페이스에 선언됨
- remove(): 현재 큐의 head에 있는 것을 가져오고 제거한다.(abstract queue의 인터페이스에 선언됨)
  - poll(): queue의 인터페이스에 선언됨
- isEmpty()
- size()

## 사용예시

```java
import java.util.PriorityQueue;

PriorityQueue<Integer> pq = new PriorityQueue<>();
pq.add(3);
pq.add(2);
pq.add(1);

while(!pq.isEmpty()){
    System.out.println(pq.poll()); // 1, 2, 3 순으로 출력
}
```

```java
import java.util.Collections;
import java.util.PriorityQueue;

PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
pq.add(1);
pq.add(2);
while(!pq.isEmpty()){
    System.out.println(pq.remove()); // 2 1 순으로 출력    
}
```

##  maxheap, minheap이 아니라 직접 queue의 정렬 기준을 만들기

```java
import java.util.Comparator;
import java.util.PriorityQueue;

PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String>() {
  @Override
  public int compare(String o1, String o2) {
    return 0; // 직접 정렬 기준을 작성한다.
  }
})
```

## 관련 문제
- https://www.acmicpc.net/problem/1655

## 참고자료
- https://www.geeksforgeeks.org/priority-queue-class-in-java/
- https://tosuccess.tistory.com/155
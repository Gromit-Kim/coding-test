# Sort
- 목차
  1. Arrays Sort
  2. Sorting a List 
  3. Sorting a Set
  4. Sorting a Map
  5. Sorting Custom Objects

## Arrays Sort
### 오름차순 정렬
```java
public static void sort(int[] arr);
public static void sort(int[] arr, int from_Index, int to_Index);
```
#### 사용 예시

```java
import java.util.Arrays;
import java.util.Comparator;

int[] arr1 = {13, 7, 6, 45, 21, 9, 101, 102};
Arrays.sort(arr1); // arr1 : [6, 7, 9, 13, 21, 45, 101, 102]

int[] arr2 = {13, 7, 6, 45, 21, 9, 101, 102};
Arrays.sort(arr2, 1,5); // arr2: [13, 6, 7, 21, 45, 9, 2, 100]
```
### 내림차순 정렬
#### 사용 예시
```java
import java.util.Arrays;
import java.util.Collections;

// Collections.reverseOrder를 위해서 
// int[]가 아니라 Integer[]를 사용해야한다.
Integer[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 };
Arrays.sort(arr, Collections.reverseOrder()); // [100, 45, 21, 13, 9, 7, 6, 2]

int[] sortedArray = IntStream.of(arr1)
        .boxed()
        .sorted(Comparator.reverseOrder())
        .mapToInt(i -> i)
        .toArray();
```

## Sorting a List
```java
import java.util.Collections;

List<Integer> toSortList = Ints.asList(toSort);
Collections.sort(toSortList);
```

## Sorting a Set
`LinkedHashSet`을 사용해서 삽입 순서를 유지한다.

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

Set<Integer> integersSet = new LinkedHashSet<>(Ints.asList(toSort));
List<Integer> lst = new ArrayList<>(integersSet);
```

## Sorting Map
### keys로 sorting하기
`LinkedHashMap` 사용
### values로 sorting하기

## Sorting Custom objects
```java
public class Book implements Comparable<Book>{
    private String title;
    private int year;
    
    public Book(String title, int year){
        this.title = title;
        this.year = year;
    }
    
    @Override
    public int compareTo(Book other){
        return Integer.compare(this.year, other.year);
    }
    // getter, setter ...
}
```

```java
import java.util.Collections;

List<Book> lst = new ArrayList<>();
// ...
Collections.sort(lst);
```

## 참고자료
- https://www.geeksforgeeks.org/arrays-sort-in-java-with-examples/
- https://www.baeldung.com/java-sorting
- https://www.w3schools.com/java/ref_arrays_sort.asp
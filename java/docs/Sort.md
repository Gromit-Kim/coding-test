## Arrays
```Java
import java.util.Arrays;
import java.util.Comparator;

int[] numbers = new int[] { -8, 7, 5, 9, -2, 3};
Arrays.sort(numbers);
Arrays.sort(numbers, Comparator.reverseOrder());
```

```java
import java.util.Comparator;
import java.util.stream.IntStream;

int[] numbers = IntStream.of(numbers)
        .boxed()
        .sorted(Comparator.reverseOrder())
        .mapToInt(i -> i)
        .toArray();
```

```java
import java.util.Arrays;
import java.util.Comparator;
Employee[] employees = new Employee[]{... };
Arrays.sort(employees, Comparator.comparing(Employee::getName));
Arrays.sort(employees, Comparator.comparing(Employee::getName).reversed());
```

## List
```java
List<Human> humans = List.newArrayList(
        new Human(),
        new Human()
);

humans.sort(
        (h1, h2) -> h1.getName().compareTo(h2.getName());
);

Comparator<Human> comparator = (h1, h2) -> h1.getName().compareTo(h2.getName());
humans.sort(comparator.reversed());


```
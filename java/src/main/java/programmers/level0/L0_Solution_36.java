package programmers.level0;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;

public class L0_Solution_36 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/181907?language=java
    public Object solution(String my_string, int n) {
        return my_string.substring(0, n);
    }
}

package programmers.level0;

import java.util.Arrays;

public class L0_Solution_16 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120809?language=java
    public int[] solution(int[] numbers) {
        return Arrays.stream(numbers).map(num -> num * 2).toArray();
    }
}

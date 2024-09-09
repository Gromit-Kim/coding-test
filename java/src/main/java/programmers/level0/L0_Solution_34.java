package programmers.level0;

import java.util.stream.IntStream;

public class L0_Solution_34 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/181901?language=java
    public int[] solution(int n, int k) {
        return IntStream.rangeClosed(1, n)
                .filter(i -> i % k == 0)
                .toArray();
    }
}

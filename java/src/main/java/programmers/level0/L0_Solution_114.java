package programmers.level0;

import java.util.stream.IntStream;

public class L0_Solution_114 {
    // 약수 구하기: https://school.programmers.co.kr/learn/courses/30/lessons/120897?language=java
    public int[] solution(int n) {
        return IntStream.rangeClosed(1, n)
                .filter(i -> n % i == 0)
                .toArray();
    }
}

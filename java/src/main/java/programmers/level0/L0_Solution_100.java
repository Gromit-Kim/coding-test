package programmers.level0;

import java.util.stream.IntStream;

public class L0_Solution_100 {
    // 홀짝에 따라 다른 값 반환하기: https://school.programmers.co.kr/learn/courses/30/lessons/181935?language=java
    public int solution(int n) {
        if (n % 2 == 0)
            return IntStream.rangeClosed(2, n)
                    .filter(i -> i % 2 == 0)
                    .map(i -> i * i)
                    .sum();
        return IntStream.rangeClosed(1, n)
                .filter(i -> i % 2 == 1)
                .sum();
    }
}

package programmers.level0;

import java.util.stream.IntStream;

public class L0_Solution_94 {
    // 순서쌍의 개수: https://school.programmers.co.kr/learn/courses/30/lessons/120836
    public int solution(int n) {
        return (int) IntStream.rangeClosed(1, n)
                .filter(i -> n % i == 0)
                .count();
    }
}

package programmers.level0;

import java.util.stream.IntStream;

public class L0_Solution_129 {
    // 등차수열의 특정한 항만 더하기: https://school.programmers.co.kr/learn/courses/30/lessons/181931
    public int solution(int a, int d, boolean[] included) {
        return (int) IntStream.range(0, included.length)
                .filter(i -> included[i])
                .map(i -> a + i * d)
                .sum();
    }
}

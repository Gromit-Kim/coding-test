package programmers.level1;

import java.util.stream.IntStream;

public class L1_Solution_16 {
    // 음양 더하기: https://school.programmers.co.kr/learn/courses/30/lessons/76501
    public int solution(int[] absolutes, boolean[] signs) {
        return (int) IntStream.range(0, absolutes.length)
                .map(i -> this.calc(absolutes[i], signs[i]))
                .sum();
    }

    private int calc(int n, boolean b) {
        if (b) {
            return n;
        }
        return -n;
    }
}

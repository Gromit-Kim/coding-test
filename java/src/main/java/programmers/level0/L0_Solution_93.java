package programmers.level0;

import java.util.Arrays;

public class L0_Solution_93 {
    // 조건에 맞게 수열 변환하기 1: https://school.programmers.co.kr/learn/courses/30/lessons/181882?language=java
    public int[] solution(int[] arr) {
        return Arrays.stream(arr)
                .map(n -> {
                    if (n >= 50 && n % 2 == 0) {
                        return n / 2;
                    }
                    if (n < 50 && n % 2 == 1) {
                        return n * 2;
                    }
                    return n;
                })
                .toArray();
    }
}

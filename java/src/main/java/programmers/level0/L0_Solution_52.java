package programmers.level0;

import java.util.Arrays;

public class L0_Solution_52 {
    // 조건에 맞게 수열 변환하기 3: https://school.programmers.co.kr/learn/courses/30/lessons/181835?language=java
    public int[] solution(int[] arr, int k) {
        if (k % 2 == 1) {
            return Arrays.stream(arr)
                    .map(num -> num * k)
                    .toArray();
        }
        return Arrays.stream(arr)
                .map(num -> num + k)
                .toArray();
    }
}

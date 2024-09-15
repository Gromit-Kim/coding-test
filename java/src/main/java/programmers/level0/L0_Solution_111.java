package programmers.level0;

import java.util.stream.IntStream;

public class L0_Solution_111 {
    // 가까운 1 찾기: https://school.programmers.co.kr/learn/courses/30/lessons/181898
    public int solution(int[] arr, int idx) {
        return IntStream.range(idx, arr.length)
                .filter(i -> arr[i] == 1)
                .findFirst()
                .orElse(-1);
    }
}

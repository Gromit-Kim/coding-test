package programmers.level0;

import java.util.Arrays;

public class L0_Solution_56 {
    // 정수 찾기: https://school.programmers.co.kr/learn/courses/30/lessons/181840?language=java
    public int solution(int[] num_list, int n) {
        if (Arrays.stream(num_list)
                .anyMatch(num -> num == n))
            return 1;
        return 0;
    }
}

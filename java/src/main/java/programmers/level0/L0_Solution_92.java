package programmers.level0;

import java.util.Arrays;

public class L0_Solution_92 {
    // 길이에 따른 연산: https://school.programmers.co.kr/learn/courses/30/lessons/181879
    public int solution(int[] num_list) {
        if (num_list.length >= 11)
            return (int) Arrays.stream(num_list).sum();
        return Arrays.stream(num_list).reduce(1, (a, b) -> a * b);
    }
}

package programmers.level0;

import java.util.Arrays;

public class L0_Solution_99 {
    // 배열 원소의 길이: https://school.programmers.co.kr/learn/courses/30/lessons/120854
    public int[] solution(String[] strlist) {
        return Arrays.stream(strlist)
                .mapToInt(String::length)
                .toArray();
    }
}

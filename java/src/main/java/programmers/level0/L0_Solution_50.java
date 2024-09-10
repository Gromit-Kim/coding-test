package programmers.level0;

import java.util.stream.IntStream;

public class L0_Solution_50 {
    // 카운트 업: https://school.programmers.co.kr/learn/courses/30/lessons/181920?language=java
    public int[] solution(int start_num, int end_num) {
        return IntStream.rangeClosed(start_num, end_num).toArray();
    }
}

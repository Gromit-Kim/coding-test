package programmers.level0;

import java.util.stream.IntStream;

public class L0_Solution_33 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/181899?language=java
    public int[] solution(int start_num, int end_num) {
        return IntStream.rangeClosed(-start_num, -end_num)
                .map(i -> -i)
                .toArray();
    }
}

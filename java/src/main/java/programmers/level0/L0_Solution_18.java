package programmers.level0;

import java.util.stream.IntStream;

public class L0_Solution_18 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120813
    public int[] solution(int n){
        return IntStream.rangeClosed(1, n).filter(i -> i % 2 == 1).toArray();
    }
}

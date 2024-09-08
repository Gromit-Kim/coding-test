package programmers.level0;

import java.util.Arrays;

public class L0_Solution_14 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120583?language=java
    public int solution(int[] array, int n) {
        return (int) Arrays.stream(array).filter(e -> e == n).count();
    }
}

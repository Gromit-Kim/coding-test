package programmers.level0;

import java.util.Arrays;

public class L0_Solution_15 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120585
    public int solution(int[] array, int height) {
        return (int) Arrays.stream(array).filter(e -> e > height).count();
    }
}

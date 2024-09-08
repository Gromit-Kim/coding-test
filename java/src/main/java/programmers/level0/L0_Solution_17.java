package programmers.level0;

import java.util.Arrays;

public class L0_Solution_17 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120811?language=java
    public int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length / 2];
    }
}

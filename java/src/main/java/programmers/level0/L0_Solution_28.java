package programmers.level0;

import java.util.Arrays;

public class L0_Solution_28 {
    // n의 배수 고르기: https://school.programmers.co.kr/learn/courses/30/lessons/120905?language=java
    public int[] solution(int n, int[] numlist) {
        return Arrays.stream(numlist).filter(num -> num % n == 0).toArray();
    }
}

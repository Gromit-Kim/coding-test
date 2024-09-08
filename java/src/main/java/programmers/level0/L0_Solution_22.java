package programmers.level0;

import java.util.Arrays;

public class L0_Solution_22 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120833
    public int[] solution(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }
}

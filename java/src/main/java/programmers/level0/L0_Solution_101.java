package programmers.level0;

import java.util.Arrays;

public class L0_Solution_101 {
    // 최댓값 만들기 (1): https://school.programmers.co.kr/learn/courses/30/lessons/120847
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1] * numbers[numbers.length - 2];
    }
}

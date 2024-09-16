package programmers.level0;

import java.util.Arrays;

public class L0_Solution_125 {
    // 최댓값 만들기(2) : https://school.programmers.co.kr/learn/courses/30/lessons/120862
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int n1 = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        int n2 = numbers[0] * numbers[1];
        return Math.max(n1, n2);
    }
}

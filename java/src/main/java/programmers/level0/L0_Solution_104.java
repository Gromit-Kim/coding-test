package programmers.level0;

import java.util.Arrays;

public class L0_Solution_104 {
    // 배열의 평균값: https://school.programmers.co.kr/learn/courses/30/lessons/120817
    public double solution(int[] numbers){
        return Arrays.stream(numbers).average().orElse(0);
    }
}

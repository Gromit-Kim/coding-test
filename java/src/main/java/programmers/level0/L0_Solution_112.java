package programmers.level0;

import java.util.Arrays;

public class L0_Solution_112 {
    // 배열 회전시키기: https://school.programmers.co.kr/learn/courses/30/lessons/120844
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        if (direction.equals("right")) {
            answer[0] = numbers[numbers.length - 1];
            System.arraycopy(numbers, 0, answer, 1, answer.length - 1);
            return answer;
        }
        answer[answer.length - 1] = numbers[0];
        System.arraycopy(numbers, 1, answer, 0, answer.length - 1);
        return answer;
    }
}

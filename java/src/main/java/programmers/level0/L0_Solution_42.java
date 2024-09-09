package programmers.level0;

import java.util.Arrays;

public class L0_Solution_42 {
    // 마지막 두 원소: https://school.programmers.co.kr/learn/courses/30/lessons/181927?language=java
    public int[] solution(int[] num_list) {
        int len = num_list.length;
        int[] answer = Arrays.copyOf(num_list, len + 1);
        if (num_list[len - 2] < num_list[len - 1]) {
            answer[len] = num_list[len - 1] + num_list[len - 2];
            return answer;
        }
        answer[len] = num_list[len - 1] * 2;
        return answer;
    }
}

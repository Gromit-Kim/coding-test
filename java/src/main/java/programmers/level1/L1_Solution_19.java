package programmers.level1;

import java.util.Arrays;

public class L1_Solution_19 {
    // 제일 작은 수 제거하기: https://school.programmers.co.kr/learn/courses/30/lessons/12935
    public int[] solution(int[] arr) {
        if (arr.length == 1)
            return new int[]{-1};
        int min = (int) Arrays.stream(arr).min().orElse(-1);
        int[] answer = new int[arr.length - 1];
        int idx = 0;
        for (int n : arr) {
            if (n != min)
                answer[idx++] = n;
        }
        return answer;
    }
}

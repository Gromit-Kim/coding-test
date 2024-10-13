package programmers.level1;

import java.util.Arrays;

public class L1_Solution_55 {
    // K번째 수: https://school.programmers.co.kr/learn/courses/30/lessons/42748
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int idx = 0;
        for (int[] cmd : commands) {
            int start = cmd[0] - 1, end = cmd[1], target = cmd[2] - 1;
            int[] subarr = Arrays.copyOfRange(array, start, end);
            Arrays.sort(subarr);
            answer[idx++] = subarr[target];
        }
        return answer;
    }
}

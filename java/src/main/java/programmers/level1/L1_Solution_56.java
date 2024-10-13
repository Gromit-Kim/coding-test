package programmers.level1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class L1_Solution_56 {
    // 두 개 뽑아서 더하기: https://school.programmers.co.kr/learn/courses/30/lessons/68644
    private static Set<Integer> set = new HashSet<>();

    public int[] solution(int[] numbers) {
        dfs(0, numbers, new int[2], 0);
        int[] answer = new int[set.size()];
        int idx = 0;
        for (int num : set) {
            answer[idx++] = num;
        }
        Arrays.sort(answer);
        return answer;
    }

    private void dfs(int depth, int[] origin, int[] res, int start) {
        if (depth == 2) {
            set.add(res[0] + res[1]);
            return;
        }
        for (int i = start; i < origin.length; i++) {
            res[depth] = origin[i];
            dfs(depth + 1, origin, res, i + 1);
        }
    }
}

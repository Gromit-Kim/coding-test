package programmers.level2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class L2_Solution_47 {
    // 숫자 변환하기: https://school.programmers.co.kr/learn/courses/30/lessons/154538
    public int solution(int x, int y, int n) {
        int[] dp = new int[y + 1]; // dp[i] : i로 변환하는 최소 연산 횟수
        Arrays.fill(dp, -1); // x 이전까지는 변환 불가이므로 -1이다.
        dp[x] = 0;

        for (int i = x; i <= y; i++) {
            if (dp[i] == -1) {
                continue; // 아직 도달할 수 없는 경우 건너뛴다.
            }

            if (i * 2 <= y) {
                if (dp[i * 2] == -1 || dp[i * 2] > dp[i] + 1) {
                    dp[i * 2] = dp[i] + 1;
                }
            }
            if (i * 3 <= y) {
                if (dp[i * 3] == -1 || dp[i * 3] > dp[i] + 1) {
                    dp[i * 3] = dp[i] + 1;
                }
            }
            if (i + n <= y) {
                if (dp[i + n] == -1 || dp[i + n] > dp[i] + 1) {
                    dp[i + n] = dp[i] + 1;
                }
            }
        }
        return dp[y];
    }

    public int solution2(int x, int y, int n) {
        int[] visited = new int[y + 1]; // visitied[i] : i가 되기 위한 최소 이동 수
        Queue<Integer> q = new LinkedList<>();
        q.add(x);
        while (!q.isEmpty()) {
            int cur = q.poll();
            if (cur == y) {
                return visited[cur];
            }
            int[] nexts = new int[] {cur + n, cur * 2, cur * 3};
            for(int next: nexts){
                if(next <= y && visited[next] == 0){
                    q.add(next);
                    visited[next] = visited[cur] + 1;
                }
            }
        }
        return -1;
    }
}

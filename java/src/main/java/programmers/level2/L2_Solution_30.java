package programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

public class L2_Solution_30 {
    // 타겟 넘버: https://school.programmers.co.kr/learn/courses/30/lessons/43165
    private static int ans = 0;
    private boolean[] visited;

    public int solution(int[] numbers, int target) {
        visited = new boolean[numbers.length];
        dfs(0, numbers, 0, target);
        return ans;
    }

    private void dfs(int depth, int[] origin, int sum, int target) {
        if (depth == origin.length) {
            if (sum == target) {
                ans++;
            }
            return;
        }
        dfs(depth + 1, origin, sum + origin[depth], target);
        dfs(depth + 1, origin, sum - origin[depth], target);
    }

    private void bfs(int[] origin, int target) {
        Queue<int[]> q = new LinkedList();
        q.offer(new int[]{0, 0}); // depth, sum
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int depth = cur[0], sum = cur[1];

            if (origin.length == depth) {
                if (sum == target) {
                    ans++;
                }
            } else {
                q.offer(new int[]{depth + 1, sum + origin[depth]});
                q.offer(new int[]{depth + 1, sum - origin[depth]});
            }
        }
    }
}

package programmers.level2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class L2_Solution_63 {
    // 전력망을 둘로 나누기: https://school.programmers.co.kr/learn/courses/30/lessons/86971?language=java
    public int solution(int n, int[][] wires) {
        List<List<Integer>> board = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            board.add(new ArrayList<>());
        }

        for (int[] wire : wires) {
            int a = wire[0], b = wire[1];
            board.get(a).add(b);
            board.get(b).add(a);
        }

        int answer = Integer.MAX_VALUE;
        for (int[] wire : wires) {
            int a = wire[0], b = wire[1];

            int cnt1 = bfs(n, a, b, board);
            int cnt2 = bfs(n, b, a, board);

            int diff = Math.abs(cnt1 - cnt2);
            answer = Math.min(answer, diff);
        }
        return answer;
    }

    private int bfs(int n, int start, int skip, List<List<Integer>> board) {
        boolean[] visited = new boolean[n + 1];
        visited[0] = true;

        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;
        int cnt = 1;

        while (!q.isEmpty()) {
            int cur = q.poll();
            for (int next : board.get(cur)) {
                if (!visited[next] && !(cur == start && next == skip)) {
                    q.add(next);
                    visited[next] = true;
                    cnt++;
                }
            }
        }
        return cnt;
    }
}

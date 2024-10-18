package programmers.level2;

public class L2_Solution_27 {
    // 피로도: https://school.programmers.co.kr/learn/courses/30/lessons/87946
    private boolean[] visited;
    private int answer = 0;

    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        dfs(0, k, dungeons, 0);
        return answer;
    }

    private void dfs(int depth, int k, int[][] dun, int cnt) {
        if (depth == dun.length) {
            answer = Math.max(answer, cnt);
            return;
        }
        for (int i = 0; i < dun.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                if (k >= dun[i][0]) {
                    dfs(depth + 1, k - dun[i][1], dun, cnt + 1);
                } else {
                    dfs(depth + 1, k, dun, cnt);
                }
                visited[i] = false;
            }
        }
    }
}

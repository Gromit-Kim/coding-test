package programmers.level0;

public class L0_Solution_195 {
    // 정수를 나선형으로 배치하기: https://school.programmers.co.kr/learn/courses/30/lessons/181832
    private static int[][] DIRECTION = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        boolean[][] visited = new boolean[n][n];

        dfs(0, 0, 0, answer, visited, 1, n);

        return answer;
    }

    private void dfs(int x, int y, int dir, int[][] answer, boolean[][] visited, int cur, int n) {
        if (cur > n * n)
            return;
        answer[x][y] = cur;
        visited[x][y] = true;

        int nX = x + DIRECTION[dir][0];
        int nY = y + DIRECTION[dir][1];
        if (!isValid(nX, nY, n) || visited[nX][nY]) {
            dir = (dir + 1) % 4;
            nX = x + DIRECTION[dir][0];
            nY = y + DIRECTION[dir][1];
        }
        dfs(nX, nY, dir, answer, visited, cur + 1, n);
    }

    private boolean isValid(int x, int y, int n) {
        return x >= 0 && x < n && y >= 0 && y < n;
    }
}

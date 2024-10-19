package programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

public class L2_Solution_34 {
    // 게임 맵 최단거리: https://school.programmers.co.kr/learn/courses/30/lessons/1844
    private static int[] dx = new int[]{-1, 1, 0, 0};
    private static int[] dy = new int[]{0, 0, -1, 1};

    private int[][] visited;

    public int solution(int[][] maps) {
        int n = maps.length, m = maps[0].length;
        visited = new int[n][m];
        bfs(0, 0, maps, n, m);
        return visited[n - 1][m - 1] == 0 ? -1 : visited[n - 1][m - 1];
    }

    private void bfs(int sx, int sy, int[][] maps, int n, int m) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{sx, sy});
        visited[sx][sy] = 1;
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0], y = cur[1];
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (isValid(nx, ny, n, m) && maps[nx][ny] == 1) {
                    q.offer(new int[]{nx, ny});
                    visited[nx][ny] = visited[x][y] + 1;
                }
            }
        }
    }

    private boolean isValid(int x, int y, int n, int m) {
        return x >= 0 && x < n && y >= 0 && y < m && visited[x][y] == 0;
    }
}

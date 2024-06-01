package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class L2_Solution_33 {
    private static boolean[][] visited;
    private static int[] dx = {0, 0, 1, -1}; // 동서남북
    private static int[] dy = {1, -1, 0, 0};
    private static int answer = -1;

    // [게임 맵 최단 거리] https://school.programmers.co.kr/learn/courses/30/lessons/1844
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;

        visited = new boolean[n][m];

        bfs(maps, n, m);

        return answer;
    }

    public void bfs(int[][] maps, int n, int m) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(0, 0, 1));
        visited[0][0] = true;

        while (!q.isEmpty()) {
            Pair cur = q.poll();
            if (cur.x == n - 1 && cur.y == m - 1) {
                answer = cur.distance;
                return;
            }
            for (int i = 0; i < 4; i++) {
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    if (!visited[nx][ny] && maps[nx][ny] == 1) {
                        q.offer(new Pair(nx, ny, cur.distance + 1));
                        visited[nx][ny] = true;
                    }
                }
            }
        }
    }

}

class Pair {
    public int x;
    public int y;
    public int distance;

    public Pair(int x, int y, int distance) {
        this.x = x;
        this.y = y;
        this.distance = distance;
    }
}

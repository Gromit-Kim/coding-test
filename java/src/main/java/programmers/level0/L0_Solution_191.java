package programmers.level0;

public class L0_Solution_191 {
    // 안전지대: https://school.programmers.co.kr/learn/courses/30/lessons/120866

    public int solution(int[][] board) {
        int n = board.length;
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isSafe(i, j, board)) {
                    answer++;
                }
            }
        }
        return answer;
    }

    private boolean isSafe(int x, int y, int[][] board) {
        if (board[x][y] == 1)
            return false;
        int[] x_dir = {-1, 0, 1, -1, 1, -1, 0, 1};
        int[] y_dir = {-1, -1, -1, 0, 0, 1, 1, 1};
        for (int i = 0; i < 8; i++) {
            int nx = x + x_dir[i];
            int ny = y + y_dir[i];
            if (isValid(nx, ny, board.length) && board[nx][ny] == 1) {
                return false;
            }
        }
        return true;
    }

    private boolean isValid(int x, int y, int n) {
        return x >= 0 && x < n && y >= 0 && y < n;
    }
}

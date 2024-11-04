package programmers.level2;

public class L2_Solution_49 {
    // 프렌즈 4블록: https://school.programmers.co.kr/learn/courses/30/lessons/17679
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        char[][] boardArray = new char[m][n];
        for (int i = 0; i < m; i++) {
            boardArray[i] = board[i].toCharArray();
        }

        while (true) {
            boolean[][] deletedInfo = getDeletedInfo(m, n, boardArray);
            int cnt = delete(m, n, boardArray, deletedInfo);
            if (cnt == 0) {
                break;
            }
            answer += cnt;
            update(m, n, boardArray);
        }

        return answer;
    }

    private boolean[][] getDeletedInfo(int m, int n, char[][] board) {
        boolean[][] info = new boolean[m][n];
        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < m - 1; j++) {
                char ch1 = board[i][j];
                char ch2 = board[i + 1][j];
                char ch3 = board[i][j + 1];
                char ch4 = board[i + 1][j + 1];

                if (ch1 == '0' || ch2 == '0' || ch3 == '0' || ch4 == '0') {
                    continue;
                }
                if (ch1 == ch2 && ch1 == ch3 && ch1 == ch4) {
                    info[i][j] = info[i + 1][j] = info[i][j + 1] = info[i + 1][j + 1] = true;
                }
            }
        }
        return info;
    }

    private int delete(int m, int n, char[][] board, boolean[][] deletedInfo) {
        int cnt = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (deletedInfo[i][j]) {
                    cnt++;
                    board[i][j] = '0';
                }
            }
        }
        return cnt;
    }

    private void update(int m, int n, char[][] board) {
        for (int j = 0; j < n; j++) {
            for (int i = m - 1; i > 0; i--) {
                if (board[i][j] == '0') {
                    int k = i - 1;
                    while (k >= 0 && board[k][j] == '0') {
                        k--; // 0이 아닌 가장 높은 k의 위치를 찾는다.
                    }
                    if (k >= 0) {
                        board[i][j] = board[k][j];
                        board[k][j] = '0';
                    }
                }
            }
        }
    }
}

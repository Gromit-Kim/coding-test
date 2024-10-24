package programmers.level2;

public class L2_Solution_39 {
    // 땅따먹기: https://school.programmers.co.kr/learn/courses/30/lessons/12913
    int solution(int[][] land) {
        int row = land.length;
        int col = land[0].length;
        int[][] dp = new int[row][col];
        for (int i = 0; i < col; i++) {
            dp[0][i] = land[0][i];
        }

        for (int i = 1; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int max = 0;
                for (int k = 0; k < col; k++) {
                    if (j != k) {
                        max = Math.max(max, dp[i - 1][k]);
                    }
                }
                dp[i][j] = max + land[i][j];
            }
        }
        int answer = 0;
        for (int i = 0; i < col; i++) {
            answer = Math.max(answer, dp[row - 1][i]);
        }
        return answer;
    }
}

package programmers;

public class L2_Solution_42 {
    int solution(int[][] land) {
        int[][] dp = new int[land.length][4];
        for (int i = 0; i < 4; i++)
            dp[0][i] = land[0][i];

        for (int i = 1; i < land.length; i++) { // 행
            for (int j = 0; j < 4; j++) { // 고정된 열(dp의 열)
                int max = 0;
                for (int k = 0; k < 4; k++) { // 이전 열의 것을 밟지 않았을 때의 최대 계산
                    if (j != k) {
                        max = Math.max(max, dp[i - 1][k]);
                    }
                }
                dp[i][j] = max + land[i][j];
            }
        }


        int answer = 0;
        for (int i = 0; i < 4; i++)
            answer = Math.max(answer, dp[land.length - 1][i]);
        return answer;
    }
}

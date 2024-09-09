package programmers.level0;

public class L0_Solution_23 {
    // 개미군단 : https://school.programmers.co.kr/learn/courses/30/lessons/120837
    static int[] dp = new int[1001];

    static {
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 1;
        dp[4] = 2;
        dp[5] = 1;
    }

    public int solution(int hp) {
        for (int i = 6; i <= hp; i++) {
            dp[i] = Math.min(dp[i - 1] + 1, dp[i - 3] + 1);
            dp[i] = Math.min(dp[i], dp[i - 5] + 1);
        }
        return dp[hp];
    }
}

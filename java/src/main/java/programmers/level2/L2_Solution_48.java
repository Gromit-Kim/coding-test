package programmers.level2;

public class L2_Solution_48 {
    // 2 x n 타일링: https://school.programmers.co.kr/learn/courses/30/lessons/12900
    public int solution(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1_000_000_007;
        }
        return dp[n];
    }
}

package programmers.level2;

public class L2_Solution_13 {
    // 멀리뛰기: https://school.programmers.co.kr/learn/courses/30/lessons/12914
    public long solution(int n) {
        long[] dp = new long[2001];
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i <= n; i++){
            dp[i] = (dp[i-1] + dp[i-2]) % 1234567;
        }
        return dp[n];
    }

}

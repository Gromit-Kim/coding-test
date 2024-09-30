package programmers.level0;

public class L0_Solution_181 {
    // 저주의 숫자 3: https://school.programmers.co.kr/learn/courses/30/lessons/120871
    public int solution(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + 1;
            while (check(dp[i])) {
                dp[i] += 1;
            }
        }
        return dp[n];
    }

    private boolean check(int n) {
        if (n % 3 == 0)
            return true;
        while (n > 0) {
            if (n % 10 == 3)
                return true;
            n /= 10;
        }
        return false;
    }
}

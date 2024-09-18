package programmers.level0;

public class L0_Solution_146 {
    // 팩토리얼: https://school.programmers.co.kr/learn/courses/30/lessons/120848
    public int solution(int n) {
        int[] dp = new int[11];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= 10; i++) {
            dp[i] = i * dp[i - 1];
        }

        int answer = 0;
        for (int i = 10; i >= 0; i--) {
            if (dp[i] <= n) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}

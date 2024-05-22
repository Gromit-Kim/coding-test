package programmers;

public class L2_Solution_8 {
    private static final int[] DP = new int[100001];

    static {
        DP[0] = 0;
        DP[1] = 1;
    }

    public int solution(int n) {
        if (n <= 1)
            return n;
        if (DP[n] != 0)
            return DP[n];
        for (int i = 2; i <= n; i++) {
            DP[i] = (DP[i - 1] + DP[i - 2]) % 1234567;
        }
        return DP[n];
    }
}

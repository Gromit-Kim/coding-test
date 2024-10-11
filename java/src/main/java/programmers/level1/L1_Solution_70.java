package programmers.level1;

public class L1_Solution_70 {
    // 소수 만들기: https://school.programmers.co.kr/learn/courses/30/lessons/12977
    private static int ANS = 0;

    public int solution(int[] nums) {
        dfs(3, 0, nums, new int[3], 0);
        return ANS;
    }

    // n개 중 r개를 뽑는다. res에는 origin의 값이 들어간다.
    private void dfs(int r, int depth, int[] origin, int[] res, int start) {
        if (depth == r) {
            if (isPrime(res[0] + res[1] + res[2])) {
                ANS++;
            }
            return;
        }
        for (int i = start; i < origin.length; i++) {
            res[depth] = origin[i];
            dfs(r, depth + 1, origin, res, i + 1);
        }
    }

    private boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}

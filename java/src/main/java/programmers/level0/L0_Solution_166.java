package programmers.level0;

public class L0_Solution_166 {
    // 10page - 구슬을 나누는 경우의 수 : https://school.programmers.co.kr/learn/courses/30/lessons/120840
    public int solution(int balls, int share) {
        return combi(balls, share);
    }

    private int combi(int n, int k) {
        if (n == k || k == 0)
            return 1;
        return combi(n - 1, k - 1) + combi(n - 1, k);
    }
}

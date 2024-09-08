package programmers.level0;

public class L0_Solution_13 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120830
    public int solution(int n, int k) {
        return n * 12000 + 2000 * (k - (n / 10));
    }
}

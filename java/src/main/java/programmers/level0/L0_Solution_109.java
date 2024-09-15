package programmers.level0;

public class L0_Solution_109 {
    // 제곱수 판별: https://school.programmers.co.kr/learn/courses/30/lessons/120909
    public int solution(int n) {
        double sqrt = Math.sqrt(n);
        if (sqrt % 1 == 0)
            return 1;
        return 2;
    }
}

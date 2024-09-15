package programmers.level0;

public class L0_Solution_113 {
    // 369게임: https://school.programmers.co.kr/learn/courses/30/lessons/120891
    public int solution(int order) {
        int answer = 0;
        while (order > 0) {
            int n = order % 10;
            if (n == 3 || n == 6 || n == 9)
                answer++;
            order /= 10;
        }
        return answer;
    }
}

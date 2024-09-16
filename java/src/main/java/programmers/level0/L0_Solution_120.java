package programmers.level0;

public class L0_Solution_120 {
    // 주사위 게임 2: https://school.programmers.co.kr/learn/courses/30/lessons/181930
    public int solution(int a, int b, int c) {
        int answer = 1;
        int count = 1;
        if (a == b || a == c || b == c) {
            count++;
        }

        if (a == b && b == c) {
            count++;
        }

        for (int i = 1; i <= count; i++) {
            answer *= (int) (Math.pow(a, i) + Math.pow(b, i) + Math.pow(c, i));
        }

        return answer;
    }
}

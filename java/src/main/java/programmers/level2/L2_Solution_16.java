package programmers.level2;

public class L2_Solution_16 {
    // 예상 대진표: https://school.programmers.co.kr/learn/courses/30/lessons/12985
    public int solution(int n, int a, int b) {
        a -= 1;
        b -= 1;
        int answer = 1;
        while (a / 2 != b / 2) {
            a /= 2;
            b /= 2;
            answer++;
        }
        return answer;
    }
}

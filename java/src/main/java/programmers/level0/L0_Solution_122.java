package programmers.level0;

public class L0_Solution_122 {
    // 피자 나눠 먹기(2) : https://school.programmers.co.kr/learn/courses/30/lessons/120815
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= 6; i++) {
            if (n * i % 6 == 0) {
                answer = (int) (n * i / 6);
                break;
            }
        }
        return answer;
    }
}

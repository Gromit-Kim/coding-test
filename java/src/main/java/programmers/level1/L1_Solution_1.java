package programmers.level1;

public class L1_Solution_1 {
    public int solution(int n) {
        int answer = 1;
        while (n % answer != 1) {
            answer++;
        }
        return answer;
    }
}

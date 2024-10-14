package programmers.level1;

public class L1_Solution_13 {
    public long solution(int a, int b) {
        long answer = 0;
        int s = Math.min(a, b);
        int e = Math.max(a, b);
        for (int i = s; i <= e; i++)
            answer += i;
        return answer;
    }
}

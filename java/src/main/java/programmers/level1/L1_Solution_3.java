package programmers.level1;

public class L1_Solution_3 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        int idx = 0;
        for (long i = x; idx < n; i += x) {
            answer[idx++] = i;
        }
        return answer;
    }
}

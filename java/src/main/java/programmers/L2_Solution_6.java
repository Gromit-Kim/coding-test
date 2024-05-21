package programmers;

public class L2_Solution_6 {
    public int solution(int n) {
        int answer = 1;
        for (int start = 1; start < n; start++) {
            int sum = start;
            for (int end = start + 1; end < n; end++) {
                sum += end;
                if (sum == n) {
                    answer++;
                    break;
                }
                if (sum > n) {
                    break;
                }
            }
        }
        return answer;
    }
}

package programmers.level1;

public class L1_Solution_67 {
    // 기사단원의 무기: https://school.programmers.co.kr/learn/courses/30/lessons/136798
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            int cnt = getCount(i);
            if (cnt > limit) {
                answer += power;
            } else {
                answer += cnt;
            }
        }
        return answer;
    }

    private int getCount(int n) {
        int cnt = 0;
        for (int i = 1; i * i <= n; i++) {
            if (i * i == n)
                cnt++;
            else if (n % i == 0)
                cnt += 2;
        }
        return cnt;
    }
}

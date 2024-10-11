package programmers.level1;

public class L1_Solution_71 {
    // 소수 찾기: https://school.programmers.co.kr/learn/courses/30/lessons/12921
    public int solution(int n) {
        int answer = 1;
        for (int i = 3; i <= n; i++) {
            if (isPrime(i))
                answer++;
        }
        return answer;
    }

    private boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}

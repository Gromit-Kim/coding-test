package programmers.level2;

public class L2_Solution_37 {
    // k진수에서 소수 개수 구하기: https://school.programmers.co.kr/learn/courses/30/lessons/92335
    public int solution(int n, int k) {
        int answer = 0;
        String numStr = Long.toString(n, k);
        for (String data : numStr.split("0")) {
            if (!data.isEmpty() && isPrime(Long.parseLong(data))) {
                answer++;
            }
        }
        return answer;
    }

    private boolean isPrime(long num) {
        if (num < 2) {
            return false;
        }
        for (long i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
